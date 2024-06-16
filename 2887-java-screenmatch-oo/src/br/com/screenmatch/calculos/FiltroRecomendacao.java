package br.com.screenmatch.calculos;

public class FiltroRecomendacao {
    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificao() >= 4) {
            System.out.println("Esta entre os preferidos do momento!");
        } else if (classificavel.getClassificao() >= 2) {
            System.out.println("Muito bem avaliado no momento!");
        } else {
            System.out.println("Coloque na sua lista para assistir depois.");
        }
    }
}
