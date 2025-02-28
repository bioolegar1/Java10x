package NivelIntermediario.Polimorfismo;

public class Main {

    public static void main(String[] args) {

        //Obj Uzumaki
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da folha", 16, 22, RankNinja.GENIN);
        naruto.mostrarDados();
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        System.out.println("\n ==========================\n");

        //obj Uchiha
        Uchiha sasuke = new Uchiha("Sasuke Uchiha","Aldeia da Folha",17, 25, RankNinja.GENIN);
        sasuke.mostrarDados();
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();
        sasuke.sharinganAtivado();
        sasuke.Chidori();

        System.out.println("\n ==========================\n");

        Uchiha madara = new Uchiha("Uchiha Madara","Aldeia da Folha",45, 135, RankNinja.HOKAGE );
        madara.mostrarDados();
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();
        madara.sharinganAtivado();
        //metodo comum
        madara.inteligenciaDeCombate();
        //sobrecarregado metod
        madara.inteligenciaDeCombate(90);


        System.out.println("\n ==========================\n");

        Uchiha itachi =new Uchiha(
                "Itachi Uchiha",
                "Aldeia da Folha",
                21,
                135,
                RankNinja.JOUNIN );

        itachi.mostrarDados();
        itachi.habilidadeEspecial();
        itachi.sharinganAtivado();
        itachi.metodoProvisorio();

        System.out.println("\n ==========================\n");

        //obj Hatake
        Hatake kakashi = new Hatake("Hatake Kakashi", "Aldeia da Folha", 25, 245, RankNinja.JOUNIN) ;
        kakashi.boasVindas();
        kakashi.sharinganAtivado();
        kakashi.ninjaDeElite();
        kakashi.hokageSaudacao();
        kakashi.Chidori();
        kakashi.habilidadeEspecial();
    }
}
