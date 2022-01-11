/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.UC09_DefinirProgramacaoFestival_Controller;
import model.GestFest;

/**
 *
 * @author hugoqueiroz
 */
public class UC09_DefinirProgramacaoFestivalUI {
    
    private GestFest empresa;
    private UC09_DefinirProgramacaoFestival_Controller controller;
    

    UC09_DefinirProgramacaoFestivalUI(GestFest empresa) {
        this.empresa = empresa;
        controller = new UC09_DefinirProgramacaoFestival_Controller(empresa);
    }

    void run() {
 
    }
    
}
