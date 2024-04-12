package br.com.alura.screenmatch.modelos;

public class Filme {

    // Atributos
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    // Contém o modificador de visibilidade/acesso
    private double somaDasAvaliacoes;
    // Contém o modificador de visibilidade/acesso
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    //==========================
    // Método Acessor - Getters
    //==========================
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    //==========================
    // Métodos Incluir - Setters
    //==========================
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //==========================================
    // Métodos - Maneira de 'fazer alguma coisa'
    //==========================================

    // Exibir Nome e Ano de Lançamento
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    // Somar as avaliações e contando quantas avaliações tiver
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    // Calcular a média das avaliações
    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
