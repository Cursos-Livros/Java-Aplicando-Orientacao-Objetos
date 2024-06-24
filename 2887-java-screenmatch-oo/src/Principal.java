import br.com.screenmatch.calculos.CalculadoraTempo;
import br.com.screenmatch.calculos.FiltroRecomendacao;
import br.com.screenmatch.modelos.Episodios;
import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        System.out.println("----------- br.com.screenmatch.modelos.Filme ----------");

        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.getSomaDasAvaliacoes());
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        System.out.println();

        System.out.println("----------- br.com.screenmatch.modelos.Serie ----------");

        Serie serie = new Serie();
        serie.setNome("House");
        serie.setAnoDeLancamento(2004);
        serie.exibeFichaTecnica();
        serie.setTemporada(8);
        serie.setNumeroEpisodiosTemporada(24);
        serie.setMinutosEpisodio(50);
        System.out.println("Duracao total da serie: " + serie.getDuracaoEmMinutos());

        CalculadoraTempo calculadoraTempo = new CalculadoraTempo();
        calculadoraTempo.incluir(meuFilme);
        System.out.println(calculadoraTempo.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodios episodio = new Episodios();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}