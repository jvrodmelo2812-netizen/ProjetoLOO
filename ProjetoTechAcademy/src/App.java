import Visao.ColaboradorMenu;
import Visao.VisitanteMenu;
import Tools.Util;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("---------MENUS--------");
        System.out.println("(1)   MENU COLABORADOR");
        System.out.println("(2)   MENU VISITANTE");
        System.out.println("(9)   SAIR");
        System.out.print("Qual Menu deseja Manusear? ");
        int opcao = scan.nextInt();
        while (opcao != 9) {
            switch (opcao) {
                case 1:
                    ColaboradorMenu menu = new ColaboradorMenu();
                    menu.executar();
                    return;
                case 2:
                    VisitanteMenu menu2 = new VisitanteMenu();
                    menu2.executar();
                    return;
                case 9:
                    System.out.println("SE CUIDEEEE");
                    break;
            
                default:
                    System.out.println("OPA, OPÇÃO ERRADA!!!");
                    break;
            }Util.limparTerminal();
                    

        }
       

    }
}
