package visibilidades;

public class Classe1 {

    // visto somente dentro da classe
    private String atributo1;

    // dentro da classe e subclasses
    protected String atributo2;

    // em qualquer lugar
    public String atributo3;


    private void metodo1(){}

    protected void metodo2(){}

    public void metodo3(){}
}
