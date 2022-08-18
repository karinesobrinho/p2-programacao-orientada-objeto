package main.java.br.ufabc.poo.instrumento.corda;

import main.java.br.ufabc.poo.instrumento.Instrumento;

public class Guitarra extends Instrumento implements Distorcao {
    private int numeroCordas;

    public Guitarra(String marca, long numeroLoteFabricacao, int numeroCordas) {
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
        return "Guitarra emitindo som\n";
    }

    @Override
    public String emitirSomDistorcido() {
        return "Guitarra emitindo som distorcido\n";
    }

    @Override
    public String toString() {
        return "Guitarra da marca " + this.getMarca() + "\n";
    }
}
