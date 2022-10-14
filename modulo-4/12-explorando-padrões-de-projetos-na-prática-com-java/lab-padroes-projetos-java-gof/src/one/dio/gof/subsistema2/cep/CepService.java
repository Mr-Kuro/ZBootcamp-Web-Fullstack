package one.dio.gof.subsistema2.cep;

public class CepService {

    private static CepService instancia = new CepService();;
    private CepService() {
        super();
    }

    public static CepService getInstance(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "araraqua";
    }

    public String recuperarEstado(String cep){
        return "araraqua";
    }
}
