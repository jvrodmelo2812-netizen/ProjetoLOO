package Dominio;

public class Estagiario extends AbsPrestador {
    private Double valorBolsa;
    private int cargaHorariaSemanal;
    private String areaEstagio;

    public Double getValorBolsa(){
        return valorBolsa;
    }

    public void setValorBolsa(Double valorBolsa){
        this.valorBolsa = valorBolsa;
    }

    public int getCargaHorariaSemanal(){
        return cargaHorariaSemanal;
    }

    public void setCargaHorariaSemanal(int cargaHorariaSemanal){
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    public String getAreaEstagio(){
        return areaEstagio;
    }

    public void setAreaEstagio(String areaEstagio){
        this.areaEstagio = areaEstagio;
    }

    @Override 
    public void exibir(){
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Email: " + this.email);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Endereço: " + this.endereco);
        System.out.println("Valor da Bolsa: " + this.valorBolsa);
        System.out.println("Carga Horaria Semanal: " + this.cargaHorariaSemanal);
        System.out.println("Area do Estagio: " + this.areaEstagio);

    }

    public Estagiario(){}

    public Estagiario(int codigo, String nome, String cpf, String email, String telefone, String endereco, Double valorBolsa, int cargaHorariaSemanal, String areaEstagio){
        super(codigo, nome, cpf, email, telefone, endereco);
        this.valorBolsa = valorBolsa;
        this.cargaHorariaSemanal = cargaHorariaSemanal;
        this.areaEstagio = areaEstagio;
    }

}
