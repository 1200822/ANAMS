/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import model.Festival;
import model.GestFest;

/**
 *
 * @actor grupo2 
 */

public class UC04_ConsultarInformacaoFestival_Controller {
    private GestFest empresa;
    private Festival festival;

    public UC04_ConsultarInformacaoFestival_Controller(GestFest empresa) {
        this.empresa = empresa;
    }

    public String apresentaInformacaoFestival() {
        return festival.toString();
    }

    public void consultaInformacaoFestival(String festival) {
        this.festival = empresa.procuraFestival(festival);
    }

}
