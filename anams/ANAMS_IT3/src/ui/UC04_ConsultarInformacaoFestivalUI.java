/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui;

import controller.UC04_ConsultarInformacaoFestival_Controller;
import model.GestFest;
import utils.Utils;

/**
 *
 * @actor grupo2 
 */

public class UC04_ConsultarInformacaoFestivalUI {
    
    private GestFest empresa;
    private UC04_ConsultarInformacaoFestival_Controller controller;

    UC04_ConsultarInformacaoFestivalUI(GestFest empresa) {
        
        this.empresa = empresa;
        controller = new UC04_ConsultarInformacaoFestival_Controller(empresa);
        
    }

    public void run() {
        
        System.out.println("\nConsultar Informação de um Festival:");

        String consulti = introduzaDados();
        controller.consultaInformacaoFestival(consulti);

        apresentaDados();
    }
    
    public String introduzaDados(){
        return Utils.readLineFromConsole("Introduza o nome do Festival a consultar");
    }

    public void apresentaDados(){
        System.out.println(controller.apresentaInformacaoFestival());
    }    
    
}
