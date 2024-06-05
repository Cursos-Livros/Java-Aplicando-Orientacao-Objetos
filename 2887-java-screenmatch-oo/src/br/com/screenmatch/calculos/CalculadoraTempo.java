package br.com.screenmatch.calculos;

import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Titulo;

public class CalculadoraTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void incluir(Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
