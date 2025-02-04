package Condicoes;

public class Desafio3NinjasCorreçao {
    public static void main(String[] args) {
        //Ninja 1
        String nomeNinja1 = "Naruto Uzumaki";
        int idade = 14;
        String missao = "Encontrar o Bandido";
        String statusDaMissao = "Em andamento";
        char nivelDaMissao = 'A';



        //Verificar nivel da missão e idade do Ninja
        if (idade < 15 ){
            if (nivelDaMissao == 'C' || nivelDaMissao == 'D'){
                statusDaMissao = "Concluida";
            }else {
                statusDaMissao = "Não Concluida, você é muito jovem para esta missão";
            }
            statusDaMissao = "Concluida";
        }

        System.out.println("Nome do Ninja: " + nomeNinja1);
        System.out.println("Idade do Ninja: " + idade + "anos");
        System.out.println("Missao: " + missao);
        System.out.println("Status da missão: " + statusDaMissao);
        System.out.println("Nivel da missão: " + nivelDaMissao);

        System.out.println("_________________________________");



        //Ninja 2
        String nomeNinja2 = "Sasuke Uchiha";
        int idade2 = 9 ;
        String missao2 = "Reconhecimento da Aldeia";
        String statusDaMissao2 = "Em andamento";
        char nivelDaMissao2 = 'S';

        //Verifica nivel da missão e idade do Ninja
        if (idade < 15 ){
            if (nivelDaMissao2 == 'C' || nivelDaMissao2 == 'D'){
                statusDaMissao2 = "Concluida";
            }else {
            statusDaMissao2 = "Não Concluida, você é muito jovem para esta missão";
            }
            statusDaMissao2 = "Concluida";
        }

        System.out.println("Nome do Ninja: " + nomeNinja2);
        System.out.println("Idade do Ninja: " + idade2 + " anos");
        System.out.println("Missao: " + missao2);
        System.out.println("Status da missão: " + statusDaMissao2);
        System.out.println("Nivel da missão: " + nivelDaMissao2);



        System.out.println("_________________________________");



        //Ninja 3
        String nomeNinja3 = "Sakura Haruno";
        int idade3 = 22;
        String missao3 = "Curar feridos da guerra";
        String statusDaMissao3 = "Em andamento";
        char nivelDaMissao3 = 'D';

        //Verifica nivel da missao e idade di ninja
        if (idade < 15 ){
            if(nivelDaMissao3 == 'C' || nivelDaMissao3 == 'D'){
                statusDaMissao3 = "Concluida";
            }else {
                statusDaMissao3 = "Não Concluida";
            }
            statusDaMissao3 = "Concluida";
        }

        System.out.println("Nome do Ninja: " + nomeNinja3);
        System.out.println("Idade do Ninja: " + idade3 + "anos");
        System.out.println("Missao: " + missao3);
        System.out.println("Status da missão: " + statusDaMissao3);
        System.out.println("Nivel da missão: " + nivelDaMissao3);

        System.out.println("_________________________________");

    }
}
