package FakeDB;
import java.util.ArrayList;
import Dominio.*;

public class EstagiarioFakeDB extends AbsGenericFakeDB<Estagiario> {
    @Override 
    protected void autoPreencher(){
        this.dados.add(new Estagiario(110, "Mario", "092345", "Luigi@gmail.com", "67998453965", "R. Dos Cogumelos", 2500.0, 40, "Encanamento"));
        this.dados.add(new Estagiario(111, "Steve", "928375", "Mine@gmail.com", "67991846249", "R. Das Planicies", 2000.0, 44, "Mineração"));
        this.dados.add(new Estagiario(112, "Sonic", "658230", "Speed@gmail.com", "67954673203", "R. 108", 4500.0, 20, "Atletismo"));
        this.dados.add(new Estagiario(113, "Sasuke", "659433", "Naruto@gmail.com", "67976763548", "R. Da Folha", 3000.0, 35, "Eletricista"));
        this.dados.add(new Estagiario(114, "Ash Ketchum", "947365", "Poke@gmail.com", "67964454632", "Rota 102", 3200.0, 48, "Veterinario"));
    }

    public EstagiarioFakeDB(){
        this.dados = new ArrayList<>();
        this.autoPreencher();
    }

}
