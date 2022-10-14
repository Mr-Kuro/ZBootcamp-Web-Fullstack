package one.dio.gof.facede;

import one.dio.gof.subsistema1.crm.CrmService;
import one.dio.gof.subsistema2.cep.CepService;

public class Facede{

    public  void mgrarCliente(String nome, String cep){

        String cidade = CepService.getInstance().recuperarCidade(cep);
        String estado = CepService.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, estado, cidade);
    }
}
