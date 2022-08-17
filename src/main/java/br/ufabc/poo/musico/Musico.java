package main.java.br.ufabc.poo.musico;

import main.java.br.ufabc.poo.instrumento.Instrumento;

import java.util.ArrayList;

public class Musico {
    private String nome;
    private ArrayList<Instrumento> instrumentos;

    public Musico(String nome, ArrayList<Instrumento> instrumentos) {
        this.nome = nome;
        this.instrumentos = instrumentos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Instrumento> getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(ArrayList<Instrumento> instrumentos) {
        this.instrumentos = instrumentos;
    }
}
