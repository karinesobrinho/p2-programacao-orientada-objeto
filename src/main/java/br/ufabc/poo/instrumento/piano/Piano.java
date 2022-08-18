package main.java.br.ufabc.poo.instrumento.piano;

import main.java.br.ufabc.poo.instrumento.Instrumento;

public class Piano extends Instrumento {
    public Piano(String marca, long numeroLoteFabricacao) {
        super(marca, numeroLoteFabricacao);
    }

    @Override
    public String toString() {
        return "Piano da marca " + this.getMarca() + "\n";
    }
}
