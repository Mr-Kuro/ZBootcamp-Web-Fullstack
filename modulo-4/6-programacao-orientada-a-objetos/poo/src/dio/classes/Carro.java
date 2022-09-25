package classes;

/*aula estrutura básica: classe */

public class Carro {
    String cor;
    String modelo;
    int capacidadeDoTanque;

    Carro(){};

    Carro(String cor, String modelo, int capacidade){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeDoTanque = capacidade;
    };

    // Get e set cor
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // Get e set modelo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Get e set capacidade do tanque
    public int getCapacidadeDoTanque() {
        return capacidadeDoTanque;
    }

    public void setCapacidadeDoTanque(int capacidadeDoTanque) {
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    public double totalValorTanque(double valorCombustivel){
        return capacidadeDoTanque * valorCombustivel;
    };


}
