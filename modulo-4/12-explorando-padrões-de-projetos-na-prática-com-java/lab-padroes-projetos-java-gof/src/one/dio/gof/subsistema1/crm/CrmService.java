package one.dio.gof.subsistema1.crm;

public class CrmService {

    private CrmService(){
        super();
    }

    public static void gravarCliente(String nome, String cep, String estado, String cidade) {
        System.out.println("Cliente salvo no sistema de CRM.");
        System.out.println("nome = " + nome);
        System.out.println("cep = " + cep);
        System.out.println("estado = " + estado);
        System.out.println("cidade = " + cidade);
    }
}
