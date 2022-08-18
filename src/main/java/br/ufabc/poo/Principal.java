package main.java.br.ufabc.poo;
import main.java.br.ufabc.poo.instrumento.Instrumento;
import main.java.br.ufabc.poo.instrumento.corda.Guitarra;
import main.java.br.ufabc.poo.instrumento.corda.Violao;
import main.java.br.ufabc.poo.instrumento.piano.Armario;
import main.java.br.ufabc.poo.instrumento.piano.EfeitoSonoro;
import main.java.br.ufabc.poo.instrumento.piano.Piano;
import main.java.br.ufabc.poo.musico.Musico;

import java.util.ArrayList;

public class Principal {
    public static void main(String args[]){
        ArrayList instrumentosMusico1 = new ArrayList<>();
        Musico musico1 = new Musico("Fulano", instrumentosMusico1);
        System.out.print(musico1.tocarInstrumento());

        Instrumento guitarra = new Guitarra("generica", 123, 6);
        instrumentosMusico1.add(guitarra);
        Instrumento violao = new Violao("generica", 123, 6);
        instrumentosMusico1.add(violao);

        EfeitoSonoro efeito1 = new EfeitoSonoro("tandan");
        ArrayList efeitos = new ArrayList<>();
        Armario armario = new Armario("mogno");
        Instrumento piano = new Piano("generica", 123, efeitos, armario, false, 2, 40);
        instrumentosMusico1.add(piano);

        musico1.setInstrumentos(instrumentosMusico1);
        System.out.print(musico1.tocarInstrumento());
        System.out.print(musico1.toString());
    }
}
