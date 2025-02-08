package Condicoes;

import java.util.Scanner;

public class Desafio2TentaivaSolo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int MAX_NUMBER = 5;
        String[] ninjas = new String[MAX_NUMBER];
        int ninjasRegistred = 0;

        int option = 0;
        while (option != 4) {

            System.out.println("\n ===== Menu Ninja ====");
            System.out.println("1. Cadastrar Ninjas");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Excluir Ninjas");
            System.out.println("4. Sair");
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
                    System.out.println( ninjasRegistred == 0 ? "Nenhum Ninja Cadastrado!": "==== Lista de Ninjas ====");
                        for (int i = 0; i < ninjasRegistred; i++) {
                            System.out.println((i + 1) + ". " + ninjas[i]);
                        }

                        System.out.println("Digite o número do Ninja que deseja excluir: ");
                        int index = scanner.nextInt();
                        scanner.nextLine();


                        if(index < 1 || index > ninjasRegistred) {
                            System.out.println("Numero inválido!Tente novamente!");
                        } else {
                            index--;

                            for (int i = index; i < ninjasRegistred -1; i++) {
                                ninjas[i] =  ninjas[i+1];
                                }

                                ninjas[--ninjasRegistred] = null;
                                System.out.println("Ninja Excluido com sucesso!");
                        }
                }
                break;

                case 4: {
                    System.out.println("Estamos Finalizando o programa");
                }
                break;

            }

        }
        scanner.close();
    }
}
