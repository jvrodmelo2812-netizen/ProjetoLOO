package DAO;
import Dominio.Visitante;
import FakeDB.VisitanteFakeDB;

public class VisitanteDAO extends AbsGenericDAO<Visitante>{
    @Override 
    public Visitante create (Visitante novo){
        int ultimoCodigo = this.repositorio.getLast().getCodigo();
        int proximoCodigo = ultimoCodigo + 1;
        novo.setCodigo(proximoCodigo);
        this.repositorio.add(novo);
        return novo;
    }

    @Override 
    public Visitante  delete(Visitante apagado){
        int codigoProcurado = apagado.getCodigo();
        return this.deletePorID(codigoProcurado);
    }

    @Override 
    public Visitante readOne(int codigo ){
        for(Visitante item : this.repositorio){
            if(item.getCodigo() == codigo ){
                return item;
            }
        }
        return null;
    }

    @Override 
    public Visitante update (Visitante alterado){
        int codigoProcurado = alterado.getCodigo();
        Visitante original = this.readOne(codigoProcurado);
        if ( original != null ) {
            int indice = this.repositorio.indexOf(original);
            this.repositorio.set(indice, alterado);
            return alterado;
        }
        return null;
    }

    public Visitante deletePorID(int codigo){
        Visitante original = this.readOne(codigo);
        if(original != null){
            this.repositorio.remove(original);
            return original;
        }
        return null;

    }

    public VisitanteDAO(){
        this.repositorio = new VisitanteFakeDB().getDados();
    }

}
