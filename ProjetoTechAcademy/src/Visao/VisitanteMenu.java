package Visao;
import java.util.Scanner;
import Servico.VisitanteServ;
import Tools.Util;
import Dominio.Visitante;

public class VisitanteMenu extends AbsMenu {

    private VisitanteServ servico;
    private Visitante visitSelecionado;

     @Override
    public void executar(){
        int opcao = 0;
        while(opcao != 9){
            System.out.println("\n\n");
            opcao = this.exibirMenuPrincipal("VISITANTE");
            switch (opcao) {
                case 1:
                    this.listar();
                    break;
                case 2:
                    this.pesquisarPorCodigo();
                    this.pausar();
                    break;
                case 3:
                    this.incluir();
                    break;
                case 4:
                    this.alterar();
                    break;
                case 5:
                    this.excluir();
                    break;
                case 9:
                    System.out.println("ATé A PRÓXIMA!!");
                    break;
                    
                default:
                    System.out.println("OPA, OPÇÃO INDISPONIVEL!!!");
                    this.pausar();
                    break;
            }
            Util.limparTerminal();
        }
    }
    private void listar(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("---------------LISTAR-------------");

        for(Visitante item: this.servico.listar()){
            item.exibir();
            System.out.println("---------------------------");
        }
    } 
    private void pesquisarPorCodigo(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("---------------BUSCA-------------");

        System.out.print("DIGITE O CÓDIGO:");
        int codigo = this.scan.nextInt();
        this.scan.nextLine();
        this.visitSelecionado = this.servico.buscar(codigo);
        if(this.visitSelecionado != null){
            this.visitSelecionado.exibir();
        }else{
            System.out.println("USUARIO NÃO ENCONTRADO");
        }

    }
    private void incluir(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("---------------ADICIONAR-------------");
        System.out.println("  NOME: ");
        String nome = this.scan.nextLine();
        System.out.print("  CPF:");
        String cpf = this.scan.nextLine();
        System.out.print("  EMAIL:");
         String email = this.scan.nextLine();
        System.out.print("  TELEFONE:");
         String telefone= this.scan.nextLine();
        System.out.print("  ENDEREÇO:");
         String endereco = this.scan.nextLine();
        System.out.print("  MOTIVO DA VISITA:");
         String motivoVisita = this.scan.nextLine();
        System.out.print("  NUMERO DO CRACHÁ:");
         int numeroCracha= this.scan.nextInt();
        System.out.print("  SETOR VISITADO:");
         String setorVisitado= this.scan.nextLine();

         Visitante novo = new Visitante(0, nome, cpf, email, telefone, endereco, motivoVisita, numeroCracha, setorVisitado);
         this.servico.adicionar(novo);
         novo.exibir();
    } 

    private void alterar(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("---------------EDITAR-------------");
        this.pesquisarPorCodigo();
        if(visitSelecionado == null){
            System.out.println("ERRO - AÇÃO INCAPAZ DE SER PROSSEGUIDA");
            this.pausar();
            return;
        }
        int opcao = 0;

        while (opcao != 9) {
            System.out.println("---------ALTERAR---------");
            System.out.println("(1) NOME ");
            System.out.println("(2) CPF ");
            System.out.println("(3) EMAIL ");
            System.out.println("(4) TELEFONE ");
            System.out.println("(5) ENDEREÇO ");
            System.out.println("(6) MOTIVO DA VISITA ");
            System.out.println("(7) NUMERO DO CRACHÁ ");
            System.out.println("(8) SETOR VISITADO ");
            System.out.println("(9) SALVAR ");
            System.out.print("Selecione uma opção: ");

            opcao = this.scan.nextInt();
            this.scan.nextLine();
            switch (opcao) {
                case 1:
                    
            this.visitSelecionado.exibir();
                    System.out.print("NOME: ");
                    String nome = this.scan.nextLine();
                    this.visitSelecionado.setNome(nome);
                    break;
                case 2:
                    
            this.visitSelecionado.exibir();
                    System.out.print("CPF: ");
                    String cpf = this.scan.nextLine();
                    this.visitSelecionado.setCpf(cpf);
                    
                    break;
                case 3:
                    
            this.visitSelecionado.exibir();
                    System.out.print("EMAIL: ");
                    String email = this.scan.nextLine();
                    this.visitSelecionado.setEmail(email);
                    
                    break;
                case 4:
                    
            this.visitSelecionado.exibir();
                    System.out.print("TELEFONE: ");
                    String telefone = this.scan.nextLine();
                    this.visitSelecionado.setTelefone(telefone);
                    
                    break;
                case 5:
                    
            this.visitSelecionado.exibir();
                    System.out.print("ENDEREÇO: ");
                    String endereco = this.scan.nextLine();
                    this.visitSelecionado.setEndereco(endereco);
                    
                    break;
                case 6:
                    
            this.visitSelecionado.exibir();
                    System.out.print("MOTIVO DA VISITA: ");
                    String motivoVisita = this.scan.nextLine();
                    this.visitSelecionado.setMotivoVisita(motivoVisita);
                    
                    break;
                case 7:
                    
            this.visitSelecionado.exibir();
                    System.out.print("NUMERO DO CRACHÁ: ");
                    int numeroCracha = this.scan.nextInt();
                    this.scan.nextLine();
                    this.visitSelecionado.setCrachaNumero(numeroCracha);
                    
                    break;
                case 8:
                    
            this.visitSelecionado.exibir();
                    System.out.print("SETOR VISITADO: ");
                    String setorVisita = this.scan.nextLine();
                    this.visitSelecionado.setSetorVisita(setorVisita);
                    
                    break;
                case 9:
                    this.visitSelecionado = this.servico.editar(visitSelecionado);
                    this.visitSelecionado.exibir();
                    break;
            
                default:
                    break;
                    }
            }

    }

        private void excluir(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("---------------EXCLUIR-------------");
        this.pesquisarPorCodigo();
        if (this.visitSelecionado == null ){
            System.out.println("EROO - INCAPAZ DE SEGUIR COM A EXCLUSÃO");
            return;
        }

        System.out.print("Deseja continuar com a exclusão ? (1 - SIM) (2- NÃO)");
        int opcao = this.scan.nextInt();
        if(opcao == 1){
            this.visitSelecionado = this.servico.excluir(visitSelecionado);

            this.visitSelecionado.exibir();
        }

        
     }
            


    public VisitanteMenu(){
        this.servico = new VisitanteServ();
        this.scan = new Scanner(System.in);
    }
}
