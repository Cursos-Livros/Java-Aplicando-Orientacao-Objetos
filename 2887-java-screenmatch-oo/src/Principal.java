public class Principal {
    public static void main(String[] args) {

        System.out.println("----------- Filme ----------");

        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());

        System.out.println();

        System.out.println("----------- Serie ----------");

        Serie serie = new Serie();
        serie.setNome("House");
        serie.setAnoDeLancamento(2004);
        serie.exibeFichaTecnica();
        serie.setTemporada(8);
        serie.setNumeroEpisodiosTemporada(24);
        serie.setMinutosEpisodio(50);
        System.out.println("Duracao total da serie: " + serie.getDuracaoEmMinutos());
    }
}