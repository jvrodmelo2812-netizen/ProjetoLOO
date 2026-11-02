package FakeDB;

import java.util.ArrayList;
import Dominio.Professor;

public class ProfessorFakeDB {
    private ArrayList<Professor> dados;

    public ArrayList<Professor> getDados(){
        return this.dados;
    }
   
    private void autoPreencher(){
        this.dados.add(new Professor(1, "Cunha Almeida", "1231", "Matemática"));
        this.dados.add(new Professor(2, "Daniela Abraão", "1232", "Física"));
        this.dados.add(new Professor(3, "Beijamin Arola", "1233", "Química"));
        this.dados.add(new Professor(4, "Barbosa Borba", "1234", "Biologia"));
        this.dados.add(new Professor(5, "Atelhiety Bruno", "1235", "História"));
    }

    public ProfessorFakeDB(){
        this.dados = new ArrayList<>();
        this.autoPreencher();
    }
}