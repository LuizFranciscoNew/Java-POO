import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;

public class Principal {

    public static void main(String[] args) {

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        Filme meuFilme = new Filme();
        meuFilme.setNome("The Matrix");
        meuFilme.setAnoDeLancamento(1999);
        meuFilme.setDuracaoEmMinutos(135);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(8);
        meuFilme.avalia(9);

        System.out.println("Média de avaliações do filme: " +meuFilme.pegaMedia());
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar 2");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(240);
        outroFilme.setIncluidoNoPlano(true);

        System.out.println("==============================================================");

        Serie supernatural = new Serie();

        supernatural.setNome("Supernatural");
        supernatural.setAnoDeLancamento(2005);
        supernatural.exibeFichaTecnica();
        supernatural.setTemporadas(16);
        supernatural.setEpisodiosPorTemporada(20);
        supernatural.setMinutosPorEpisodio(40);
        System.out.println("Duração para maratornar a Série: " + supernatural.getDuracaoEmMinutos());

        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(supernatural);

        System.out.println("Tempo total: "+ calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero((1));
        episodio.setSerie(supernatural);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}