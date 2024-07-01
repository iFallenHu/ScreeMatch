package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Poderoso Chefão",1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8.5);
        meuFilme.avalia(9.8);
        meuFilme.avalia(10.0);
        System.out.println(meuFilme.pegaMedia());

        Filme outroFilme = new Filme("Vingadores", 2012);
        outroFilme.setDuracaoEmMinutos(150);
        outroFilme.setIncluidoNoPlano(false);

        Filme outroFilme2 = new Filme("Vingadores - Guerra Infinita", 2018);
        outroFilme2.setDuracaoEmMinutos(150);
        outroFilme2.setIncluidoNoPlano(false);

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(380);

        filtro.filtra(episodio);

        ArrayList<Filme> lista = new ArrayList<>();
        lista.add(meuFilme);

        System.out.println("Tamanho da lista: " +lista.size());
        System.out.println("Primeiro Filme: " +lista.get(0));
        System.out.println(lista);



    }


}

