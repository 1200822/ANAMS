/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui;

import controller.UC01_EspecificarTipoEnt_Controller;
import model.GestFest;
import model.TipoEntidade;
import utils.Utils;

/**
 *
 * @actor grupo2 
 */

public class UC01_EspecificarTipoEntidadeUI {
    private GestFest empresa;
    private UC01_EspecificarTipoEnt_Controller controller;

    public UC01_EspecificarTipoEntidadeUI(GestFest empresa) {
        this.empresa = empresa;
        controller = new UC01_EspecificarTipoEnt_Controller(empresa);
    }

    public void run() {
        System.out.println("\n Nova Tipo de Entidade:");

        controller.novoTipoEntidade();

        controller.setTipo(introduzDados());

        apresentaDados();

        if (Utils.confirma("Confirma os dados? (S/N)")) {
            if(controller.registaTipoEntidade()) {
                System.out.println("Tipo de entidade registado com sucesso.");
            }else {
                System.out.println("Tipo de entidade não registado.");
            }
        }
    }
    
    private String introduzDados() {
        return Utils.readLineFromConsole("Introduza a Designação do Tipo de Entidade: ");
    }
    
    private void apresentaDados() {
        System.out.println("\nTipo de Entidade:\n" + controller.getTipoEntidadeAsString());
    }
 
}