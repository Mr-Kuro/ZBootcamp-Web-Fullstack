package one.dio.gof.singleton;

/**
 * Singleto "apressado"
 *
 *@author Mr.Kuro
 */
public class SingletonEager {

    private static final SingletonEager instancia = new SingletonEager();
    private SingletonEager() {
        super();
    }
    public static SingletonEager getInstance(){
        return instancia;
    }
}
