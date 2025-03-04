package Iniciante.Condicoes;

public class EstudoTernarios {
    public static void main(String[] args) {
        /*
        Ternarios são usados para diminuir os codigos
        Variável = (Condição) ? valorSerVerdadeiro : valorSerFalso;
         */

        short numerodeMissoes = 9;
        String nivel = (numerodeMissoes >= 10) ? "Esse Ninja esta com mais de 10 missões" : "Esse ninja tem Menos de 10 missoes";
        System.out.println(nivel);

        int resultado = (5 > 3) ? 10 : 20;
        System.out.println(resultado);

        String naruto = (7 > 8) ? "Naruto apanha de novo": "Naruto cria um clone";
        System.out.println(naruto);

        System.out.println( naruto + "\n" + nivel);

        naruto = ("o que sai aqui ?" + naruto);
        System.out.println(naruto);

    }
}
