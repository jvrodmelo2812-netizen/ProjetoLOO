package FakeDB;

import java.util.ArrayList;

import Dominio.Aluno;

public class AlunoFakeDB {
    private ArrayList<Aluno> dados;

    public ArrayList<Aluno> getDados(){
        return this.dados;
    }
   
    private void autoPreencher(){
        this.dados.add(new Aluno(1, "Carlos Alberto", "1231"));
        this.dados.add(new Aluno(2, "Daniel Molo", "1232"));
        this.dados.add(new Aluno(3, "Branda Magalhóes", "1233"));
        this.dados.add(new Aluno(4, "Carlinhos TravaZap", "1234"));
        this.dados.add(new Aluno(5, "Ricardo Brand", "1235"));
    }

    public AlunoFakeDB(){
        this.dados = new ArrayList<>();
        this.autoPreencher();
    }
}