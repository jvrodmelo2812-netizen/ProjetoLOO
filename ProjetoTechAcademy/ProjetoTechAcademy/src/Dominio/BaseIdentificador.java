public abstract class BaseIdentificador {
    protected int codigo;

    public getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    BaseIdentificador(){}
    BaseIdentificador(int codigo){
        this.codigo = codigo;
    }
}