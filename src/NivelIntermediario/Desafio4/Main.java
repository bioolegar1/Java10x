package NivelIntermediario.Desafio4;

public class Main {
    public static void main(String[] args) {

        Ninja naruto = new NinjaBasico("Naruto", 16, "Clone das Sombras");
        Ninja kakashi = new NinjaAvancado("Hatake kakashi", 23, "Chidori", "Mangekyou Sharingan");

        System.out.println("Iformações do Ninja Genin");
        naruto.mostrarInformacoes();
        naruto.executarHabilidade();

        System.out.println("========================");

        System.out.println("Iformações do Ninja Jounin");
        kakashi.mostrarInformacoes();
        kakashi.executarHabilidade();



    }
}
