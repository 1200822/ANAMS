/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.UC10_ConsultarProgramacaoFestival_Controller;
import model.GestFest;
import utils.Utils;

/**
 *
 * @author hugoqueiroz
 */
public class UC10_ConsultarProgramacaoFestivalUI {

    private GestFest empresa;
    private UC10_ConsultarProgramacaoFestival_Controller controller;

    UC10_ConsultarProgramacaoFestivalUI(GestFest empresa) {
        
        this.empresa = empresa;
        controller = new UC10_ConsultarProgramacaoFestival_Controller(empresa);
        
    }

    public void run() {
 
        System.out.println("\n Consultar Programação de um Festival:");
        
        controller.listaFestivalAsString();
        introduzDados();
        controller.ProcurarReferenciaFestivalProgramacao(introduzDados());
        apresentaDados();
    }
    
    public int introduzaDados(){
        
        
        int refFestival = Utils.IntFromConsole("\n Introduza o código do Festival: ");
        return refFestival;
    }

    public void apresentaDados(){
        System.out.println("\n Programacao do Festival: \n" + controller.listaProgramacaoFestivalAsString());
        
    }    

    private void introduzDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
