/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.util.ArrayList;
import model.AssFestEnt;
import model.Entidade;
import model.Festival;
import model.GestFest;

/**
 *
 * @actor grupo2 
 */

public class UC06_AssociarEntidade_Controller {
    
    private GestFest gestfest;
    private Festival festi;
    private Entidade enti;
    private AssFestEnt ass;
    private GestFest empresa;

    public UC06_AssociarEntidade_Controller(GestFest empresa) {
        this.empresa = empresa;
    }

    public void consultaFestival(String festival) {
        this.festi = gestfest.procuraFestival(festival);
    }
    
    public void consultaEntidade(String entidade) {
        this.enti = gestfest.procuraEntidade(entidade);
    }
    
   /* public boolean associarEntidadeFestival() {
        ArrayList<AssFestEnt> ass ;
        System.out.println(enti.getTiposEnt());
        
    }*/

    public String getFestivalAsString() {
        return this.festi.toString();
    }

    public String getEntidadeAsString() {
        return this.enti.toString();
    }
    
}
