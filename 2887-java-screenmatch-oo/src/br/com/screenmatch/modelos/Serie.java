package br.com.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporada;
    private int numeroEpisodiosTemporada;
    private boolean continuaAtiva;
    private int minutosEpisodio;

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getNumeroEpisodiosTemporada() {
        return numeroEpisodiosTemporada;
    }

    public void setNumeroEpisodiosTemporada(int numeroEpisodiosTemporada) {
        this.numeroEpisodiosTemporada = numeroEpisodiosTemporada;
    }

    public boolean isContinuaAtiva() {
        return continuaAtiva;
    }

    public void setContinuaAtiva(boolean continuaAtiva) {
        this.continuaAtiva = continuaAtiva;
    }

    public int getMinutosEpisodio() {
        return minutosEpisodio;
    }

    public void setMinutosEpisodio(int minutosEpisodio) {
        this.minutosEpisodio = minutosEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporada * numeroEpisodiosTemporada * minutosEpisodio;
    }
}
