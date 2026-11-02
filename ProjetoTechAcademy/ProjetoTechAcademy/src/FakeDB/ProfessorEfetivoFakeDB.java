package FakeDB;

import java.util.ArrayList;
import Dominio.ProfessorEfetivo;

public class ProfessorEfetivoFakeDB {
    private ArrayList<ProfessorEfetivo> dados;

    public ArrayList<ProfessorEfetivo> getDados(){
        return this.dados;
    }
  
    private void autoPreencher(){
        this.dados.add(new ProfessorEfetivo(1, "Pereira Moura", "1231", "Matemática"));
        this.dados.add(new ProfessorEfetivo(2, "Borges", "1232", "Física"));
        this.dados.add(new ProfessorEfetivo(3, "Coelho Acéfe Arola", "1233", "Química"));
        this.dados.add(new ProfessorEfetivo(4, "Borga Morga", "1234", "Biologia"));
        this.dados.add(new ProfessorEfetivo(5, "Siclano Beltrano", "1235", "História"));
    }

    public ProfessorEfetivoFakeDB(){
        this.dados = new ArrayList<>();
        this.autoPreencher();
    }
}