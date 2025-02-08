package Condicoes;

import java.util.Scanner;

public class Desafio2TentaivaSolo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int MAX_NUMBER = 5;
        String[] ninjas = new String[MAX_NUMBER];
        int ninjasRegistred = 0;

        int option = 0;
        while (option != 3) {

            System.out.println("\n ===== Menu Ninja ====");
            System.out.println("1. Cadastrar Ninjas");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1: {
                    System.out.println(ninjasRegistred < MAX_NUMBER ? "Digite o nome do ninja:" : "A lista de ninjas está cheia");
                    if (ninjasRegistred < MAX_NUMBER) {
                        ninjas[ninjasRegistred++] = scanner.nextLine();
                        System.out.println("Ninja Cadastrado com sucesso!");
                    }
                }
                break;

                case 2: {
                    System.out.println(ninjasRegistred == 0 ? "Nenhum Ninja Encontrado" : "==== Listar Ninjas ====");
                    for (int i = 0; i < ninjasRegistred; i++) {
                        System.out.println(ninjas[i]);
                    }
                }
                break;

                case 3: {
                    System.out.println("Estamos Finalizando o programa");
                }
                break;

            }
            scanner.close();
        }
    }
}
