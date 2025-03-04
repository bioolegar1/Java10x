package Iniciante.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
        Scanner = É um jeito de trazer o utilizador para dentro da aplicação.
        Objetivo: O usuário vai criar um ninja e vamos validade os dados.
         */
        //Abrir o Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        //Receber o nome do ninja
        System.out.println("Escreva aqui o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        //Receber a idade do ninja
        System.out.println("Escreva aqui a Idade do Ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é: " + idadeDoNinja + " anos");

        //Tratamento de dados
        if (idadeDoNinja >= 18) {
            System.out.println(nomeDoNinja + " em mais de 18 anos, e pode ir para missões fora da aldeia");
        }else {
            System.out.println(nomeDoNinja + " é muito novo ainda, precisa treinar mais!");
        }

        //Fechar sempre o Scanner
        caixaDeTexto.close();

    }
}