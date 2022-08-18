package test.java.br.ufabc.poo;

import main.java.br.ufabc.poo.instrumento.Instrumento;
import main.java.br.ufabc.poo.instrumento.corda.Guitarra;
import main.java.br.ufabc.poo.instrumento.corda.Violao;
import main.java.br.ufabc.poo.instrumento.piano.Armario;
import main.java.br.ufabc.poo.instrumento.piano.EfeitoSonoro;
import main.java.br.ufabc.poo.instrumento.piano.Piano;
import main.java.br.ufabc.poo.musico.Musico;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class Testes {
    ArrayList<Instrumento> instrumentos;
    Musico musico;
    Instrumento guitarra;
    Instrumento violao;
    EfeitoSonoro efeito1;
    EfeitoSonoro efeito2;
    ArrayList efeitos;
    Armario armario;
    Instrumento piano;

    @Before
    public void inicializacao(){
        instrumentos = new ArrayList<>();
        musico = new Musico("musico", instrumentos);
        guitarra = new Guitarra("generica", 123, 6);
        violao = new Violao("generica", 123, 6);
        efeito1 = new EfeitoSonoro("efeito1");
        efeito2 = new EfeitoSonoro("efeito2");
        efeitos = new ArrayList<>();
        armario = new Armario("mogno");
        piano = new Piano("generica", 123, efeitos, armario, false, 2, 40);
    }

    @Test
    public void test() {
        assertEquals(musico.tocarInstrumento(), "Não toca nenhum instrumento\n");

    }
}
