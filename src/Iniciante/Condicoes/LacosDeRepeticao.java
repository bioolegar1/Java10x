package Iniciante.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {


        //objetivo: naruto tem capacidade para ate 41 clones, então apartir desse numero a kyubi deve assumir a criaão dos clones

        int numeroDeClones = 0;
        int numeroMaximoClones = 40;

        for (numeroDeClones = 0; numeroDeClones < numeroMaximoClones; numeroDeClones++) {
            System.out.println("Naruto ja fez " + " clones");
        }
        System.out.println("Naruto está perdendo a consciencia ! \n \n\n\n\n\n .. naaaaaooo!!");

        while (numeroDeClones <= 1000) {
            numeroDeClones++;
            System.out.println("Chakra da Kyubi! Total de clones agora: " + numeroDeClones);
        }
        System.out.println("Naruto ficou sem chakra! Clones encerrados.");

    }
}

