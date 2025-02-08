package Condicoes;

import java.util.Scanner;

public class NinjaManager {
    private static final int MAX_NINJAS = 5;
    private static final String[] ninjas = new String[MAX_NINJAS];
    private static int ninjasRegistered = 0;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        runMenu();
    }

    private static void runMenu() {
        int option;
        do {
            displayMenu();
            option = getUserChoice();
            handleMenuOption(option);
        } while (option != 3);
    }

    private static void displayMenu() {
        System.out.println("\n===== Menu Ninja =====");
        System.out.println("1. Cadastrar Ninja");
        System.out.println("2. Listar Ninjas");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static int getUserChoice() {
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha
        return choice;
    }

    private static void handleMenuOption(int option) {
        switch (option) {
            case 1 -> registerNinja();
            case 2 -> listNinjas();
            case 3 -> exitProgram();
            default -> System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void registerNinja() {
        if (ninjasRegistered >= MAX_NINJAS) {
            System.out.println("A lista de ninjas está cheia.");
            return;
        }

        System.out.print("Digite o nome do ninja: ");
        ninjas[ninjasRegistered++] = scanner.nextLine();
        System.out.println("Ninja cadastrado com sucesso!");
    }

    private static void listNinjas() {
        if (ninjasRegistered == 0) {
            System.out.println("Nenhum Ninja Encontrado.");
            return;
        }

        System.out.println("==== Lista de Ninjas ====");
        for (int i = 0; i < ninjasRegistered; i++) {
            System.out.println((i + 1) + ". " + ninjas[i]);
        }
    }

    private static void exitProgram() {
        System.out.println("Encerrando o programa...");
    }
}
