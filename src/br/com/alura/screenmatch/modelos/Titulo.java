package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;



    public Titulo(String nome, int anoDeLancamento){
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmbd){
        this.nome = meuTituloOmbd.title();

        if(meuTituloOmbd.year().length() > 4) {
            throw new ErroDeConversaoDeAnoException("Não consigo converter o ano" +
                    " pois tem mais de 4 caracteres.");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmbd.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmbd.runtime().substring(0,3));

    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes(){

        return totalDeAvaliacoes;
    }

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

    public void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Incluído no plano: " + incluidoNoPlano);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    public double pegaMedia(){

        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public String toString(){
        return "nome =' "+nome + '\'' +
                ", anoDeLancamento =" + anoDeLancamento + "," + "duração" + duracaoEmMinutos;
    }
}
