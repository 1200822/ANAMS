/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.util.ArrayList;
import model.GestFest;
import model.TipoBilhete;

/**
 *
 * @actor grupo2 
 */

public class UC03_EspecificarTipoBilhete_Controller {
    
    private final GestFest empresa;
    private TipoBilhete tipoB;
    private ArrayList<TipoBilhete> lstTipoBilhete;
    
    public UC03_EspecificarTipoBilhete_Controller(GestFest empresa){
        this.empresa = empresa;
    }

    public void adicionaTipoBilhete(TipoBilhete tipoBilhete){
        lstTipoBilhete.add(tipoBilhete);
    }
   
    public String getTipoBilheteAsString()
    {
        return this.tipoB.toString();
    }

    public boolean registaTipoBilhete(){
        return empresa.setLstTipoBilhete(lstTipoBilhete);
    }

}