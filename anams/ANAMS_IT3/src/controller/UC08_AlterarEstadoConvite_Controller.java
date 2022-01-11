/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

//import model.Artista;
import model.Estado;
import model.Festival;
import model.GestFest;

/**
 *
 * @author hugoqueiroz
 */
public class UC08_AlterarEstadoConvite_Controller {
    
    private final GestFest empresa;
    private Estado estado;

    public UC08_AlterarEstadoConvite_Controller(GestFest empresa) {
        this.empresa = empresa;
    }

    public void procurarConvite(Festival inserirFestival, String inserirArtista) {

    }

    public void setEstado(Estado inserirEstado) {

    }

    public Object getListaConvites() {
        return empresa.getListaConvites();
    }
    

    public Object obterConvite(int cod) {
        this.estado = this.empresa.obterEstado(cod);
        return estado;

    }

    public void setDados(String estado) {

//    if (estado.equalsIgnoreCase(Estado.Pronto.toString())) {
//            this.estado.setEstado(Estado.Pronto);
//            estado.valida();
//        }
//
//    }

//    public boolean valida() {
//        return true;
//    
//    }

//    public String obterDados() {
//    
//    return "Estado do Convite:\n" + this.estado.toString();
//    
//    }

}
    
}
