package Testes;
import java.util.ArrayList;


import Servico.VisitanteServ;
import Dominio.Visitante;

public class VisitanteTeste {


    public static void main(String[] args) {
        VisitanteServ teste1 = new VisitanteServ();
        ArrayList<Visitante> lista1 = teste1.listar();

        System.out.println("---------LISTAR------------");

        for (Visitante item: lista1){
            item.exibir();
            System.out.println("----------------------");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("------------BUSCAR----------");

        Visitante buscado = teste1.buscar(107);

        if(buscado != null){
            buscado.exibir();
            teste1.listar();
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("------------ADICIONAR------------");

        Visitante n1 = new Visitante(0, "Bruna", "9827365", "Bruna@gmai.com", "6583782452", "Rua nova pirez", "vontade de cagar", 106, "Banheiro");
        
        teste1.adicionar(n1);

        ArrayList<Visitante> listaNew = teste1.listar();
        for (Visitante item: listaNew){
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
            ArrayList<Visitante> listaexclu = teste1.listar();
            for (Visitante item: listaexclu){
            item.exibir();
            System.out.println("----------------------");
        }

    }
}
}
