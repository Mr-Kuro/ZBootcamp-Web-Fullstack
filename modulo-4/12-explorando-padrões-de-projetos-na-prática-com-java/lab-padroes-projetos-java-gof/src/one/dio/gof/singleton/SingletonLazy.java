package one.dio.gof.singleton;

/**
 * Singleto "Preguiçoso"
 *
 *@author Mr.Kuro
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance(){
        if (instancia == null)
            instancia = new SingletonLazy();
        return instancia;
    }
}
