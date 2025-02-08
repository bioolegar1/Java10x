package Condicoes;

public class Arrays {
    public static void main(String[] args) {

        String [] ninja = new String[5];
//        int [] idade = new int[3];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Katake";
        System.out.println(ninja[3]);

        //Redeclarar um array
        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tsunade";
        ninja[5] = "kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";

        //for para fazer um loop num array
        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);

        }

        //array int
        int [] idade = new int[2];
        idade[0] = 16; // array vazio sempre retorna 0 como valor
        System.out.println(idade[0]);

        //array boleean retorna false caso esteja vazio.
        boolean []  verdadeirOuFalso =  new boolean[1];
        System.out.println(verdadeirOuFalso[0]);


        //array double inicializa 0.0
        double [] flutuante = new double[1];
        System.out.println(flutuante[0]);



    String nomeDoNinja = "Gaara do deserto";




//        String [] ninjas = {"Itachi", "kabuto","asa"};
//        System.out.println(ninjas[0]);
    }
}
