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
    
    public String tocarInstrumento(){
        int n = instrumentos.size();

        String sons = " ";

        if(n > 0) {
            for (int i = 0; i < n; i++) {
                sons += instrumentos.get(i).emitirSom() + '\n';
                //emitir som distorc
            }
        } else sons += "Não toca nenhum instrumento \n";

        return sons;
    }

    public String toString() {
        String mostraInfo = "Musico: " + this.nome + "\nToca: ";

        int n = instrumentos.size();

        if(n > 0) {
            for (int i = 0; i < n; i++) {
                mostraInfo += instrumentos.get(i).toString() + '\n';
            }

        } else mostraInfo += "ainda nenhum instrumento \n";

        return mostraInfo;
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
