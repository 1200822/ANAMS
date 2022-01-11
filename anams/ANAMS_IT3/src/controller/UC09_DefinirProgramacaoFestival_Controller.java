/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Date;
import model.GestFest;
import model.Programacao;

/**
 *
 * @author hugoqueiroz
 */
public class UC09_DefinirProgramacaoFestival_Controller {
    
    private GestFest empresa;
    private Programacao programacao;
    
    public UC09_DefinirProgramacaoFestival_Controller(GestFest empresa) {
        this.empresa = empresa;
    }

    public boolean valida() {
        return true;
    }

    public boolean setDados() {
        return true;
    }
    
}
