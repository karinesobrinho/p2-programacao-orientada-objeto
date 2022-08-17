package main.java.br.ufabc.poo.instrumento.corda;

import main.java.br.ufabc.poo.instrumento.Instrumento;

public class Violao extends Instrumento implements Distorcao {
    private int numeroCordas;

    public Violao(String marca, long numeroLoteFabricacao, int numeroCordas) {
        super(marca, numeroLoteFabricacao);
        this.numeroCordas = numeroCordas;
    }

    public int getNumeroCordas() {
        return numeroCordas;
    }

    public void setNumeroCordas(int numeroCordas) {
        this.numeroCordas = numeroCordas;
    }

    @Override
    public String emitirSomDistorcido() {
        return "Guitarra emitindo som distorcido";
    }
}
