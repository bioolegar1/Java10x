package Condicoes;

public class IFELSE {
    public static void main(String[] args) {

        /*
        IF e ELSE - Condicoes
        Else IF
        Objetivo: Passar o nunja de nivel, conforme o número de missoes

        */

        //Ninja Naruto
        String nome = "Naruto Uzumaki";
        String Rank;

        int idade = 10;
        boolean hokage = false;
        short numeroDeMissoes = 20;

        //se (condição) {Faça isso}

        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunin");
        }else if (numeroDeMissoes >= 20){
            System.out.println("Rank: Jounin");
        }else{
            System.out.println("Rank: Gennin");
        }
    }
}