package NivelIntermediario.Polimorfismo;

public class Main {

    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 16;
        naruto.mostrarDados();
        naruto.habilidadeEspecial();

        System.out.println("==========================");

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 17;
        sasuke.mostrarDados();
        sasuke.habilidadeEspecial();
    }
}
