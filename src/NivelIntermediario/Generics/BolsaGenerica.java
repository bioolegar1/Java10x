package NivelIntermediario.Generics;

import java.util.ArrayList;
import java.util.List;

//Usar apenas o T Para tipo Generico
public class BolsaGenerica <T>{

    private List<T> equipamentos;

    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }
    //Adicionar lista generica
    public void adicionarEquipamentos(T equipamento) {
        this.equipamentos.add(equipamento);
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        return "Bolsa de equipamentos: " + equipamentos.toString();
    }
}