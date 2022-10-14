package one.dio.gof;

import one.dio.gof.facede.Facede;
import one.dio.gof.singleton.SingletonEager;
import one.dio.gof.singleton.SingletonLazy;
import one.dio.gof.singleton.SingletonLazyHolder;
import one.dio.gof.strategy.*;

public class Teste {
    public static void main(String[] args) {

        //Singleeton

        //testes relacionado ao desing Pattern Singleton
        SingletonLazy lazy= SingletonLazy.getInstance();
        System.out.println("lazy = " + lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println("lazy = " + lazy);

        SingletonEager eager= SingletonEager.getInstance();
        System.out.println("eager = " + eager);
        eager = SingletonEager.getInstance();
        System.out.println("eager = " + eager);

        SingletonLazyHolder lazyHolder= SingletonLazyHolder.getInstance();
        System.out.println("lazyHolder = " + lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println("lazyHolder = " + lazyHolder);


        //Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facede
        Facede facede = new Facede();
        facede.mgrarCliente("vanilton", "14300801788");

    }
}
