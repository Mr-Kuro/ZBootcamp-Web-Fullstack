package one.dio.gof.singleton;

/**
 * Singleto "Lazy Holdar"
 *
 *@author Mr.Kuro
 */
public class SingletonLazyHolder {

    private  class InstaceHolder{
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();

    }
    ;
    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return InstaceHolder.instancia;
    }
}