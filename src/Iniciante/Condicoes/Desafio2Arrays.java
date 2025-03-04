package Iniciante.Condicoes;

import java.util.Scanner;

public class Desafio2Arrays {
    public static void main(String[] args) {

        //entrada de dados
        Scanner scanner = new Scanner(System.in);

        //fazer o array
        int NUMERO_MAX = 5;
        String[] ninjas = new String[NUMERO_MAX];

        int ninjasCadastrados = 0;
        int option = 0;
        while (option != 3) {

            //cadastrar os ninjas em um array e mostrar opçoes com switch cases
            System.out.println("\n======= Menu Ninja ========");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.println("Escolha uma Opção");
            option = scanner.nextInt();
            scanner.nextLine();


            switch (option) {
                case 1:
                    if (ninjasCadastrados < NUMERO_MAX) {
                        System.out.println("Digite o nome do Ninja");
                        String nomeNinja = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja Cadastrado com sucesso!");
                    }else {
                        System.out.println("A Lista de ninjas esta cheia");
                    }
                    break;

                    case 2:
                        if (ninjasCadastrados == 0) {
                            System.out.println("Nenhum Ninja Encontrado");
                        }else {
                            System.out.println("======== Lista de Ninjas ========");
                            for (int i = 0; i < ninjas.length; i++) {
                                System.out.println(ninjas[i]);
                            }
                        }break;

                        case 3:
                            System.out.println("Estamos terminando o Programa... Aguarde");
                            break;

                default:
                    System.out.println("Essa Opçao não é valida"
                    );
            }

        }


    }
}
