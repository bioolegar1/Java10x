package NivelIntermediario.Generics.Generics2;

import java.util.ArrayList;
import java.util.List;

//Use T para tipo generico sempre = boa pratica
public class BolsaNinja <T>{

    //inicializar o array

        private final List<T> itens;

    public BolsaNinja() {
        this.itens = new ArrayList<>();
    }

    //Colocar Itens na lista:

    public void adicionarItem(T item) {
        itens.add(item);
    }

    //Mostrar a Lista de itens

    public void mostrarItens(){
        for (T item : itens) {
            System.out.println(item);
        }
    }
}
