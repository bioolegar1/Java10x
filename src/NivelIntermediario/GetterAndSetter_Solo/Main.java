package NivelIntermediario.GetterAndSetter_Solo;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------Naruto Uzumaki--------------------\n");

        Uzumaki naruto = new Uzumaki("Naruto", "Aldeia da Folha", 17, 25,  1.75);
        System.out.println("Nome do Ninja: " + naruto.getNome());
        System.out.println("Aldeia de Origem: " + naruto.getAldeia());
        System.out.println("Aldeia de Origem: " + naruto.getIdade());
        System.out.println("Altura do Ninja: " + naruto.getAltura());
        System.out.println("Numero de missões: " + naruto.getNumeroDeMissoesConcluidas());



        System.out.println("\n---------------------Sasuke Uchiha---------------------\n");

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18, 23,  1.78);
        System.out.println("Nome do Ninja: " + sasuke.getNome());
        System.out.println("Aldeia de Origem: " + sasuke.getAldeia());
        System.out.println("Aldeia de Origem: " + sasuke.getIdade());
        System.out.println("Altura do Ninja: " + sasuke.getAltura());
        System.out.println("Numero de missões: " + sasuke.getNumeroDeMissoesConcluidas());
        sasuke.setNome("Sasuke uchiha alterado");
        System.out.println("Nome do Ninja alterado: " + sasuke.getNome());
    }
}
