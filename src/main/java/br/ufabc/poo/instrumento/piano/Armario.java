package main.java.br.ufabc.poo.instrumento.piano;

public class Armario {
    private String tipoMadeira;

    public Armario(String tipoMadeira){
        this.tipoMadeira = tipoMadeira;
    }

    public String getTipoMadeira() {
        return tipoMadeira;
    }

    public void setTipoMadeira(String tipoMadeira) {
        this.tipoMadeira = tipoMadeira;
    }
}
