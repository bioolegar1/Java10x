package NivelIntermediario.RefatoracaoDeCodigo;

public class Main {
    public static void main(String[] args) {


        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 17, 23, 1.73);
        sasuke.mostrarDados();
        sasuke.sharinganAtivado();

        System.out.println("\n ----");


        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 16, 20, 1.69, BijuENUM.KURAMA);
        naruto.mostrarDados();

    }
}
