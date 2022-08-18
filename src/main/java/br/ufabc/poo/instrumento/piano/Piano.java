package main.java.br.ufabc.poo.instrumento.piano;

import main.java.br.ufabc.poo.instrumento.Instrumento;

import java.util.ArrayList;

public class Piano extends Instrumento {
    private ArrayList<EfeitoSonoro> efeitosSonoros;
    private Armario armario;
    private Boolean digital;
    private int numeroPedais;
    private int numeroTeclas;

    public Piano(String marca, long numeroLoteFabricacao, ArrayList<EfeitoSonoro> efeitosSonoros,
                 Armario armario,  Boolean digital, int numeroPedais, int numeroTeclas) {
        super(marca, numeroLoteFabricacao);
        this.efeitosSonoros = efeitosSonoros;
        this.armario = armario;
        this.digital = digital;
        this.numeroPedais = numeroPedais;
        this.numeroTeclas = numeroTeclas;
    }

    @Override
    public String emitirSom() {
        return "Piano emitindo som";
    }

    @Override
    public String toString() {
        return "Piano da marca " + this.getMarca() + "\n";
    }

    public void adicionarEfeitoSonoro(EfeitoSonoro efeitoSonoro){
        efeitosSonoros.add(efeitoSonoro);
    }

    public ArrayList<EfeitoSonoro> getEfeitosSonoros() {
        return efeitosSonoros;
    }

    public void setEfeitosSonoros(ArrayList<EfeitoSonoro> efeitosSonoros) {
        this.efeitosSonoros = efeitosSonoros;
    }

    public Armario getArmario() {
        return armario;
    }

    public void setArmario(Armario armario) {
        this.armario = armario;
    }

    public Boolean getDigital() {
        return digital;
    }

    public void setDigital(Boolean digital) {
        this.digital = digital;
    }

    public int getNumeroPedais() {
        return numeroPedais;
    }

    public void setNumeroPedais(int numeroPedais) {
        this.numeroPedais = numeroPedais;
    }

    public int getNumeroTeclas() {
        return numeroTeclas;
    }

    public void setNumeroTeclas(int numeroTeclas) {
        this.numeroTeclas = numeroTeclas;
    }
}
