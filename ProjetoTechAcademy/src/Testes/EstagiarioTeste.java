package Testes;
import Servico.EstagiarioServ;
import Dominio.Estagiario;
import java.util.ArrayList;

public class EstagiarioTeste{

    public static void main(String[] args) {
        EstagiarioServ teste1 = new EstagiarioServ();
        ArrayList<Estagiario> lista1 = teste1.listar();

        System.out.println("---------LISTAR------------");

        for (Estagiario item: lista1){
            item.exibir();
            System.out.println("----------------------");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("------------BUSCAR----------");

        Estagiario buscado = teste1.buscar(104);

        if(buscado != null){
            buscado.exibir();
            teste1.listar();
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("------------ADICIONAR------------");

        Estagiario n1 = new Estagiario(0, "Bob", "874652523", "BobSPONGE@gmail.com", "679483745", "Fenda Do Biquini", 0.50, 189, "Culinaria");
        
        teste1.adicionar(n1);

        ArrayList<Estagiario> listaNew = teste1.listar();
        for (Estagiario item: listaNew){
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
            ArrayList<Estagiario> listaexclu = teste1.listar();
            for (Estagiario item: listaexclu){
            item.exibir();
            System.out.println("----------------------");
        }

    }
    
}
}

