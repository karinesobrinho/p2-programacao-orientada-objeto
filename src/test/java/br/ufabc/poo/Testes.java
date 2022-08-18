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
    public void testTocarInstrumento() {
        assertEquals(musico.tocarInstrumento(), "Não toca nenhum instrumento\n");

        instrumentos.add(guitarra);
        instrumentos.add(violao);
        instrumentos.add(piano);

        assertEquals(musico.tocarInstrumento(),
                "Guitarra emitindo som\n" +
                "Guitarra emitindo som distorcido\n" +
                "Violão emitindo som\n" +
                "Violão emitindo som distorcido\n" +
                "Piano emitindo som\n");

        musico.setInstrumentos(new ArrayList<>());
        assertEquals(musico.tocarInstrumento(), "Não toca nenhum instrumento\n");
    }

    @Test
    public void testMusicoToString() {
        assertEquals(musico.getNome(), "musico");
        musico.setNome("novo musico");
        assertEquals(musico.getNome(), "novo musico");

        assertEquals(musico.toString(), "Musico: novo musico\n" +
                "Toca: ainda nenhum instrumento\n");

        assertEquals(musico.getInstrumentos(), instrumentos);

        instrumentos.add(piano);

        assertEquals(musico.toString(), "Musico: novo musico\n" +
                "Toca: Piano da marca generica\n");
    }
}
