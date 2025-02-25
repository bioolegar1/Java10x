package NivelIntermediario.Polimorfismo;

public class Main {

    public static void main(String[] args) {




        //Obj Uzumaki
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 16;


        naruto.mostrarDados();
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();



        System.out.println("\n ==========================\n");


        //obj Uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 17;

        
        sasuke.mostrarDados();
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();

        System.out.println("\n ==========================\n");


        Uchiha itachi = new Uchiha();

    }
}
