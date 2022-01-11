/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.Convite;
import model.Convite.Estado;
import model.Festival;
import model.GestFest;

/**
 *
 * @author grupo2
 */
public class UC08_AlterarEstadoConvite_Controller {
    private final GestFest empresa;
    private Festival festival;
    private Convite convite;
    
    public UC08_AlterarEstadoConvite_Controller(GestFest empresa){
        this.empresa = empresa;
    }
    
    public void consultaFestival(String festival){
        this.festival = empresa.procurarFestival(festival);
    }
    
    public void consultaConvite(int codigo){
        this.convite = festival.procurarConvite(codigo);
    }
    
    public Festival getFestival(){
        return this.festival;
    }
    
    public boolean alteraEstadoConvite(Estado estado){
        this.convite.setEstado(estado);
        return true;
    }
    
    public String getListaConvitesAsString(){
        return this.festival.getListaConvitesAsString();
    }
    
    public String getFestivalAsString(){
        return this.festival.toString();
    }
    
    public String getConviteAsString(){
        return this.convite.toString();
    }
}
