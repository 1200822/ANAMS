/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import model.GestFest;
import model.TipoEntidade;


public class UC01_EspecificarTipoEnt_Controller {
    private final GestFest empresa;
    private TipoEntidade tipoEntidade;
    
    public UC01_EspecificarTipoEnt_Controller(GestFest empresa){
        this.empresa=empresa;
    }
    
    public void novoTipoEntidade()
    {
        this.tipoEntidade = empresa.novoTipoEntidade();
    }
    
    public void setDesignacao(String designacao)
    {
        this.tipoEntidade.setDesignacao(designacao);
    }
        
    public String getDesign()
    {
        return this.tipoEntidade.getDesignacao();
    }
    
    public boolean registaTipoEntidade()
    {
        return this.empresa.registaTipoEntidade(this.tipoEntidade);
    }

    public String getTipoEntidadeAsString()
    {
        return this.tipoEntidade.toString();
    }
}
