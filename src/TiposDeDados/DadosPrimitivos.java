package TiposDeDados;

public class DadosPrimitivos {

    public static void main(String[] args) {

        /*
        Dados primitivos não recebem metodos
        Dados Primitivos - int, double, float, char, boolean, short.
        Objetivo da aula: criar um ninja
        */

        int idade = 16; //Valor maximo: 2147483647
        double altura = 1.74;
        char inicial ='N';
        boolean vivoOuMorto = false;
        Long saldoBancario = 99999L; //Valor Máximo: 9,223,372,036,854,775,807

        System.out.println(idade); //Comando para mostrar para o utilizador
        System.out.println(saldoBancario);
        System.out.println(vivoOuMorto);
        System.out.println("altura = " + altura);
        System.out.println("Minha idade é = " + idade);
        System.out.println("Minha idade é = " + idade);
    }
}
