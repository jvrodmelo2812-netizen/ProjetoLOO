package DAO;
import Dominio.Estagiario;
import FakeDB.EstagiarioFakeDB;

public class EstagiarioDAO extends AbsGenericDAO<Estagiario>{
    @Override 
    public Estagiario create (Estagiario novo){
        int ultimoCodigo = this.repositorio.getLast().getCodigo();
        int proximoCodigo = ultimoCodigo + 1;
        novo.setCodigo(proximoCodigo);
        this.repositorio.add(novo);
        return novo;
    }

    @Override 
    public Estagiario  delete(Estagiario apagado){
        int codigoProcurado = apagado.getCodigo();
        return this.deletePorID(codigoProcurado);
    }

    @Override 
    public Estagiario readOne(int codigo ){
        for(Estagiario item : this.repositorio){
            if(item.getCodigo() == codigo ){
                return item;
            }
        }
        return null;
    }

    @Override 
    public Estagiario update (Estagiario alterado){
        int codigoProcurado = alterado.getCodigo();
        Estagiario original = this.readOne(codigoProcurado);
        if ( original != null ) {
            int indice = this.repositorio.indexOf(original);
            this.repositorio.set(indice, alterado);
            return alterado;
        }
        return null;
    }

    public Estagiario deletePorID(int codigo){
        Estagiario original = this.readOne(codigo);
        if(original != null){
            this.repositorio.remove(original);
            return original;
        }
        return null;

    }

    public EstagiarioDAO(){
        this.repositorio = new EstagiarioFakeDB().getDados();
    }

}
