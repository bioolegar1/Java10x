package NivelIntermediario.Desafio3;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorNinjas {
    private static ArrayList<Ninja> listaNinjas = new ArrayList<>();
    private static Scanner  scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do{
            System.out.println("\nMenu de Gerenciamento de Ninjas");
            System.out.println("1. Adicionar ninja");
            System.out.println("2. Adiconar Uchiha");
            System.out.println("3. Exibir todos os Ninjas");
            System.out.println("4. Atualizar habilidade Especial de um Uchiha");
            System.out.println("5. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    adicionarNinja();
                    break;
                    case 2:
                        adicionarUchiha();
                        break;
                        case 3:
                            exibirNinjas();
                            break;
                            case 4:
                                atualizarHabilidadeUchiha();
                                break;
                                case 5:
                                    System.out.println("Saindo do Programa...");
                                    break;
                                    default:
                                        System.out.println("Opção Invalida. Tente novamente.");
            }

        } while (opcao != 5);
    }

    private static void adicionarNinja(){
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Missao: ");
        String missao = scanner.nextLine();
        System.out.print("Nivel de Dificuldade: ");
        String nivelDificuldade = scanner.nextLine();
        System.out.print("Status da Missão: ");
        String statusMissao = scanner.nextLine();

        listaNinjas.add(new Ninja(nome, idade, missao, nivelDificuldade, statusMissao));
        System.out.println("Ninja adicionado com sucesso!");
        }

        private static void adicionarUchiha() {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Missao: ");
            String missao = scanner.nextLine();
            System.out.print("Nivel de Dificuldade: ");
            String nivelDificuldade = scanner.nextLine();
            System.out.print("Status da Missão: ");
            String statusMissao = scanner.nextLine();

            listaNinjas.add(new Uchiha(nome, idade, missao, nivelDificuldade, statusMissao));
            System.out.println("Uchiha adicionado com sucesso!");
        }

    private static void exibirNinjas(){
        if (listaNinjas.isEmpty()) {
            System.out.println("Nenhum ninja Cadastrado.");
        } else {
            for (Ninja ninja : listaNinjas) {
                ninja.mostrarInformacoes();
                System.out.println(" -------------------------------");
            }
        }
    }

    private static void atualizarHabilidadeUchiha(){

        System.out.print("Nome do Uchiha para atualizar Habilidade:  ");
        String nome = scanner.nextLine();
        for (Ninja ninja : listaNinjas) {
            if ( ninja instanceof  Uchiha && ninja.nome.equalsIgnoreCase(nome)) {
                System.out.print(" Nova Habilidade Especial: ");
                String novaHabildiade = scanner.nextLine();
                ((Uchiha)ninja).mostrarHabilidadeEspecial();
                return;
            }
        }
        System.out.println("Uchiha não Encontrado.");
    }

}
