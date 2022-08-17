package main.java.br.ufabc.poo.instrumento;

import java.util.ArrayList;

public abstract class Instrumento {
    private String marca;
    private long numeroLoteFabricacao;

    public Instrumento(String marca, long numeroLoteFabricacao) {
        this.marca = marca;
        this.numeroLoteFabricacao = numeroLoteFabricacao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public long getNumeroLoteFabricacao() {
        return numeroLoteFabricacao;
    }

    public void setNumeroLoteFabricacao(long numeroLoteFabricacao) {
        this.numeroLoteFabricacao = numeroLoteFabricacao;
    }
}
