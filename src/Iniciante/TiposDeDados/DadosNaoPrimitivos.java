package Iniciante.TiposDeDados;

public class DadosNaoPrimitivos {
    /*
    Tipos não primitivos recebem metodos
    Dados não Primitivos: ‘String’, Array, Class, enum
    Objetivo: Criar um ninja, e atribuir dados a ele
     */
    public static void main(String[] args) {
        String nome = "Naruto Uzumaki";
        String nomeToUpperCase = nome.toUpperCase(); //coloca tudo em CAPSLOCK
        System.out.println("Este texto está em capslock: " + nomeToUpperCase);
        System.out.println("Este texto está normal: " + nome);

        String aldeia = "Aldeia da Folha";
        String aldeiaLowerCase = aldeia.toLowerCase();
        System.out.println(aldeiaLowerCase);
    }
}
