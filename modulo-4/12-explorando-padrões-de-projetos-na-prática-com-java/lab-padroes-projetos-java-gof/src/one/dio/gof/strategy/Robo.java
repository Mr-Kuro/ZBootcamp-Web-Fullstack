package one.dio.gof.strategy;

public class Robo {
    private Comportamento comportamento;

    public void setComportamento(Comportamento strategy) {
        this.comportamento = strategy;
    }

    public void mover(){
        comportamento.mover();
    }
}
