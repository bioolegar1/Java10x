package NivelIntermediario.Polimorfismo;

public class Main {

    public static void main(String[] args) {

        //Obj Uzumaki
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 16);
        naruto.mostrarDados();
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        System.out.println("\n ==========================\n");

        //obj Uchiha
        Uchiha sasuke = new Uchiha("Sasuke Uchiha","Aldeia da Folha",17);
        sasuke.mostrarDados();
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();
        sasuke.sharinganAtivado();
        sasuke.Chidori();

        System.out.println("\n ==========================\n");

        Uchiha itachi =new Uchiha("Itachi Uchiha", "Aldeia da Folha", 21);
        itachi.mostrarDados();
        itachi.habilidadeEspecial();
        itachi.sharinganAtivado();

        System.out.println("\n ==========================\n");

        //obj Hatake
        Hatake kakashi = new Hatake("Hatake Kakashi", "Aldeia da Folha", 25);
        kakashi.boasVindas();
        kakashi.sharinganAtivado();
        kakashi.ninjaDeElite();
        kakashi.hokageSaudacao();
        kakashi.Chidori();
    }
}
