package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {


    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao()>= 4) {
            System.out.println("Esta entre o preferido do momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento e pode ser recomendado");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }

}
