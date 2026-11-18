package Testes;
import Servico.EgressoServ;
import Dominio.Egresso;
import java.util.ArrayList;

public class EgressoTeste{

    public static void main(String[] args) {
        EgressoServ teste1 = new EgressoServ();
        ArrayList<Egresso> lista1 = teste1.listar();

        System.out.println("---------LISTAR------------");

        for (Egresso item: lista1){
            item.exibir();
            System.out.println("----------------------");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("------------BUSCAR----------");

        Egresso buscado = teste1.buscar(104);

        if(buscado != null){
            buscado.exibir();
            teste1.listar();
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("------------ADICIONAR------------");

        Egresso n1 = new Egresso(0, "Dalmata", "287356253", 2098, "Agronomia", "Peixaria");
        
        teste1.adicionar(n1);

        ArrayList<Egresso> listaNew = teste1.listar();
        for (Egresso item: listaNew){
            item.exibir();
            System.out.println("----------------------");
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("-------------EDITAR---------------");

        if(buscado != null){
            buscado.setNome("Melody");;
            teste1.editar(buscado);
            buscado.exibir();
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("-------------EXCLUIR---------------");

        if(buscado != null){
            teste1.excluir(buscado);
            ArrayList<Egresso> listaexclu = teste1.listar();
            for (Egresso item: listaexclu){
            item.exibir();
            System.out.println("----------------------");
        }

    }
    
}
}
