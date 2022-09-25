package UpcastDowncast;

public class RodarAplicacao {
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();


        // UPCAST:
        Funcionario gerente = new Gerente();
        Funcionario vended0r = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // DOWNCAST: não é recomendado e é extremamente perigoso DEVE SER EVITADO
        Vendedor vendedor = (Vendedor) new Funcionario(); //tem de ser feito de forma explícita
    }
}
