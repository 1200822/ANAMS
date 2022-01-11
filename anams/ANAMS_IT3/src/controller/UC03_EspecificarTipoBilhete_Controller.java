/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import model.GestFest;
import model.TipoBilhete;


public class UC03_EspecificarTipoBilhete_Controller {
    private final GestFest empresa;
    private TipoBilhete tipoBilhete;
    
    public UC03_EspecificarTipoBilhete_Controller(GestFest empresa){
        this.empresa=empresa;
    }
    
    public void novoTipoBilhete(){
        this.tipoBilhete=empresa.novoTipoBilhete();
    }
    
    public String getTipoBilhete(String tipo){
        return this.tipoBilhete.getTipoBilhete();
    }
    
    public void setTipoBilhete(String tipo){
        this.tipoBilhete.setTipoBilhete(tipo);
    }
    
    public boolean registaTipoBilhete(){
        return this.empresa.registaTipoBilhete(this.tipoBilhete);
    }
    
    public String getTipoBilheteAsString(){
        return this.tipoBilhete.toString();
    }
}
