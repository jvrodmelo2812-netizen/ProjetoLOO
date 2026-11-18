package DAO;
import Dominio.Egresso;
import FakeDB.EgressoFakeDB;

public class EgressoDAO extends AbsGenericDAO<Egresso> {

    @Override 
    public Egresso create(Egresso novo){
        int ultimoCodigo = this.repositorio.getLast().getCodigo();
        int proximoCodigo = ultimoCodigo + 1;
        novo.setCodigo(proximoCodigo);
        this.repositorio.add(novo);
        return novo;
    }

    @Override
    public Egresso delete(Egresso apagado) {
        int codigoProcurado = apagado.getCodigo();
        return this.deletePorID(codigoProcurado);
    }

    @Override 
    public Egresso readOne(int codigo){
        for(Egresso item: this.repositorio){
            if(item.getCodigo() == codigo ){
                return item;
            }
        }
        return null;
    }

    @Override
    public Egresso update(Egresso alterado) {
        int codigoProcurado = alterado.getCodigo();
        Egresso original = this.readOne(codigoProcurado);
        if (original != null){
            int indice = this.repositorio.indexOf(original);
            this.repositorio.set(indice, alterado);
            return alterado;
        }
        return null;
    }

    public Egresso deletePorID(int codigo){
        Egresso original = this.readOne(codigo);
        if (original != null){
            this.repositorio.remove(original);
            return original;
        }
        return null;
    }



    public EgressoDAO(){
        this.repositorio = new EgressoFakeDB().getDados();
    }
}
