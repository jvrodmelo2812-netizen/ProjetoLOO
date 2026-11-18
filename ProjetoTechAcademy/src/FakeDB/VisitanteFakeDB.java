package FakeDB;
import java.util.ArrayList;
import Dominio.*;

public class VisitanteFakeDB extends AbsGenericFakeDB<Visitante> {
    @Override
    protected void autoPreencher() {
        this.dados.add(new Visitante(105, "Manoel Gomes", "097865", "Manoel@gmail.com", "67923450987", "R. Rosa Pirez", "Quer aprender mais sobre animais", 01, "Veterinario"));
        this.dados.add(new Visitante(106, "Ricardo Miles", "908895", "RMiles@gmail.com", "67987659035", "R. Amazon Prime", "Interessado em dança", 02, "Ritmo"));
        this.dados.add(new Visitante(107, "MC Pipokinha", "257047", "MCP@gmail.com", "67924530798", "R. Dos Bobos", "Achou legal as musicas", 03, "Musica"));
        this.dados.add(new Visitante(108, "Shandão", "978753", "Shand@gmail.com", "67914326577", "R. Afonso Pena", "Gosta de mexer com tecnologia", 04, "TI"));
        this.dados.add(new Visitante(109, "Dilma Ruseff", "928374", "Dilma@gmail.com", "67909123874", "R. Shaolin", "Quer saber como saldar melhor a mandioca", 05, "Agropecuaria"));
    }

    public VisitanteFakeDB(){
        this.dados = new ArrayList<>();
        this.autoPreencher();
    }
    
}
