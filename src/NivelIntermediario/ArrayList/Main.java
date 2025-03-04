package NivelIntermediario.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        Array:
        Arrays São estaticos não alteram de tamanho
        (Deve ser definido o tamanho na criação)
         */
        String[] ninjasArray =  new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "sakura";

        for (int i = 0; i < ninjasArray.length; i++) {
            System.out.println(ninjasArray[i]);
        }
        System.out.println(" -------------");
    /*
    Listas:
    Listas não são estaticas, porem aumentar e diminuir.
     */
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Tobirama Senju");

        //adicionar na lista
        System.out.println(" -------------");
        ninjasList.add("Kakashi Hatake");
        System.out.println("Ninjas Lista:" + ninjasList);

        //remover da lista
        System.out.println(" -------------");

        ninjasList.remove(3);
        System.out.println("Ninjas Lista:" + ninjasList);

        //Trocar elementos
        System.out.println(" -------------");
        ninjasList.set(3, "Minato Namikaze");
        System.out.println("Ninjas Lista:" + ninjasList);

        //Ver o tamanho da Lista
        System.out.println(" -------------");
        System.out.println("Tamanho Lista: " + ninjasList.size() + " elementos");









    
    }


}
