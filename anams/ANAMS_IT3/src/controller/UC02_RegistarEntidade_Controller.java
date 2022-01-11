package controller;

import java.util.ArrayList;
import model.Entidade;
import model.GestFest;
import model.TipoEntidade;

/**
 *
 * @actor grupo2 
 */

public class UC02_RegistarEntidade_Controller {

    private final GestFest empresa;
    private Entidade entidade;

    public UC02_RegistarEntidade_Controller(GestFest empresa) {
        this.empresa = empresa;
    }

    public void novaEntidade() {
        this.entidade = empresa.novaEntidade();
    }

    public boolean registaEntidade() {
        return this.empresa.registaEntidade(this.entidade);
    }

    public void setDesignacao(String designacao) {
         this.entidade.setDesignacao(designacao);
    }
    
    public ArrayList<Entidade> getListaEntidades() {
        return this.empresa.getListaEntidades();
    }

      public void setTiposEntidadeDesta(ArrayList<TipoEntidade> tiposEnt) {
      this.entidade.setTiposEnt(tiposEnt);
    }
        
    public String getEntidadeAsString() {
         return this.entidade.toString();
    }

    public void adicionaTipoEntidade(TipoEntidade tipoEntidade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}