package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 20;
        Naruto.aldeia = "Aldeia da Folha";


        //Cria ninja Sasuke Uchiha

        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.aldeia = "Aldeia da Folha";

        //aplicando metodos ao objeto
        Sasuke.SharinganAtivado();
        String chanandoMetodo = Sasuke.euSouUmNinja();
        System.out.println(chanandoMetodo);

        int quantoTempoFalta = Sasuke.anosParaSeTornarHokage(70);
        System.out.println("Você tem: " + Sasuke.idade + " Então falta no minimo " + quantoTempoFalta);

        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 45;
        Sakura.aldeia = "Aldeia da Folha";

        int quantotempoFalta2 = Sakura.anosParaSeTornarHokage(70);
        System.out.println(Sakura.nome + " Você tem: " + Sakura.idade + " Então falta no minimo " + quantotempoFalta2);
    }
}
