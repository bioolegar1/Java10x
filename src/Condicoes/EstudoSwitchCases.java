package Condicoes;


import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {

        /*
        SwitchCases? que servem para casos specifics
        Obejtivo: Pedir pro utilizador escolher entre os Ninjas.

         */
        Scanner inputUser = new Scanner(System.in);

        System.out.println("Escolha um Personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        int userChoice = inputUser.nextInt();
        System.out.println("Você digitou o numero:  " + userChoice);

        switch (userChoice){
            case 1:
                System.out.println("Você escolheu Naruto Uzumaki, so tem 1 jutsu");
                break;
            case 2:
                System.out.println("Você escolheu Sasuke Uchiha, o ninja sombrio");
                break;
            case 3:
                System.out.println("Você escolheu Sakura Haruno, aprendiz da Tsunade");
                break;
            default:
                System.out.println("Você não escolheu um personagem, tente novamente");
        }
        inputUser.close();
    }
}
