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
    public String emitirSom() {
        return "Violão emitindo som\n";
    }

    @Override
    public String emitirSomDistorcido() {
        return "Violão emitindo som distorcido\n";
    }

    @Override
    public String toString() {
        return "Violão da marca " + this.getMarca() + "\n";
    }
}
