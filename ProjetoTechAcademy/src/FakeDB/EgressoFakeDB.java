package FakeDB;
import java.util.ArrayList;

import Dominio.*;


public class EgressoFakeDB extends AbsGenericFakeDB<Egresso> {
    
    @Override 
    protected void autoPreencher(){
        this.dados.add(new Egresso(100, "Carlos Alberto", "123456", 2028, "Agricultura", "Pedagogia"));
        this.dados.add(new Egresso(101, "Joana Almeida", "654321", 2030, "TI", "Banco de Dados"));
        this.dados.add(new Egresso(102, "Donatelo", "243561", 2027, "Pedagogia", "Atleta"));
        this.dados.add(new Egresso(103, "Miguel", "562134", 2040, "Direito", "Agronomia"));
        this.dados.add(new Egresso(104, "Fatima", "615243", 2032, "Apicultura", "Medicina"));
    }

    public EgressoFakeDB(){
        this.dados = new ArrayList<>();
        this.autoPreencher();
    }

}
