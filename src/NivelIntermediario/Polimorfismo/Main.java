package NivelIntermediario.Polimorfismo;

public class Main {

    public static void main(String[] args) {

        //Obj Uzumaki

        System.out.println("---------------------Naruto---------------------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da folha", 16, 22, RankNinja.GENIN);
        System.out.println(naruto);
        naruto.tacarKunai();
        System.out.println(naruto.altura);



        //obj Uchiha
        System.out.println("---------------------Sasuke---------------------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha","Aldeia da Folha",17, 25, RankNinja.GENIN);
        System.out.println(sasuke);

        System.out.println("\n---------------------anbu---------------------\n");

        Anbu ninjaAnbu = new Anbu();
        ninjaAnbu.nome = "Ninja aleatório";
        System.out.println(ninjaAnbu.nome);
        
    }
}
