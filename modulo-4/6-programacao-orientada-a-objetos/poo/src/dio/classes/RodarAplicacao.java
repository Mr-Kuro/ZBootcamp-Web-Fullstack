package classes;

public class RodarAplicacao {
    public static void main(String[] args) {
         Carro carro1 = new Carro();

         carro1.setCor("Blue");
         carro1.setModelo("BMW serie-3");
         carro1.setCapacidadeDoTanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeDoTanque());
        System.out.println(carro1.totalValorTanque(10.00d));


        Carro carro2 = new Carro("Blue","Renoult Vectra", 63);
    }
}
