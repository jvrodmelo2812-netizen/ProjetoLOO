package Dominio;

public abstract class AbsPrestador extends AbsPessoa {
    protected String email;
    protected String telefone;
    protected String endereco;

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    @Override 
    public void exibir(){
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Email: " + this.email);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Endereço: " + this.endereco);
    }

    public AbsPrestador(){}

    public AbsPrestador(int codigo, String nome, String cpf, String email, String telefone, String endereco){
        super(codigo, nome, cpf);
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

}
