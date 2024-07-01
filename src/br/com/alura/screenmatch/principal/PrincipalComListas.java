package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {

    public static void main(String[] args) {
        Filme meuFilme = new Filme("Poderoso Chefão", 1970);
        meuFilme.avalia(6);
        Filme outroFilme = new Filme("Vingadores", 2012);
        outroFilme.avalia(8.5);
        Filme outroFilme2 = new Filme("Vingadores - Guerra Infinita", 2018);
        outroFilme2.avalia(9.8);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(outroFilme2);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }
        ArrayList<Titulo> lista2 = new ArrayList<>();
        lista2.add(meuFilme);
        lista2.add(outroFilme);
        lista2.add(lost);

        Collections.sort(lista2);
        System.out.println(lista2);
    }
}
