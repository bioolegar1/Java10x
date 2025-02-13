package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        //objeto 1
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 20;
        Naruto.aldeia = "Aldeia da folha";
        Naruto.ModoSabioAtivado();
        System.out.println("======================");

        //objeto 2
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 20;
        Sakura.aldeia = "Aldeia da folha";
        Sakura.AtivarCura();
        System.out.println("======================");


        //objeto 3
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uzumaki";
        Sasuke.idade = 20;
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.SharinganAtivado();
        System.out.println("======================");


        //objeto 3
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.idade = 20;
        Hinata.aldeia = "Aldeia da folha";
        Hinata.AtivarByakugan();
        System.out.println("======================");


        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuga Uzumaki";
        Boruto.idade = 9;
        Boruto.aldeia = "Aldeia da folha";

        Boruto.ModoSabioAtivado();
        Boruto.AtivarJougan();
        Boruto.AtivarOKarma();

    }

}
