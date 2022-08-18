package main.java.br.ufabc.poo;

import main.java.br.ufabc.poo.instrumento.Instrumento;
import main.java.br.ufabc.poo.instrumento.corda.Guitarra;
import main.java.br.ufabc.poo.instrumento.corda.Violao;
import main.java.br.ufabc.poo.musico.Musico;

import java.util.ArrayList;

public class Principal {
    public static void main(String args[]){
        ArrayList instrumentosMusico1 = new ArrayList<>();

        Instrumento guitarra = new Guitarra("generica", 123, 6);
        instrumentosMusico1.add(guitarra);
        Instrumento violao = new Violao("generica", 123, 6);
        instrumentosMusico1.add(violao);

        Musico musico1 = new Musico("Fulano", instrumentosMusico1);
        System.out.print(musico1.tocarInstrumento());
        System.out.print(musico1.toString());
    }
}
