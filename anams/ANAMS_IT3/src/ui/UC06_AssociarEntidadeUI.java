/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui;

import controller.UC06_AssociarEntidade_Controller;
import model.Entidade;
import model.Festival;
import model.GestFest;
import utils.Utils;

/**
 *
 * @actor grupo2 
 */

public class UC06_AssociarEntidadeUI {

    private GestFest empresa;
    private UC06_AssociarEntidade_Controller controller;
    private Festival fest;
    private Entidade enti;

    UC06_AssociarEntidadeUI(GestFest empresa) {
        
        this.empresa = empresa;
        controller = new UC06_AssociarEntidade_Controller(empresa);
        
    }

    void run() {
        
        System.out.println("\nNova Associação de Entidade a Festival:");
        
        controller.consultaFestival(introduzDadosFestival());

        controller.consultaEntidade(introduzDadosEntidade());
        
        apresentaDados();
       /*
        if (Utils.confirma("Confirma os dados da Associação? (S/N)")) {
            if (controller.associarEntidadeFestival()){
                System.out.println("Associação registado com sucesso.");
            } else {
                System.out.println("Associação não registado.");
            }
        }*/
    }

    private String introduzDadosEntidade() {
        return Utils.readLineFromConsole("Introduza a Entidade que pretende fazer Associação: ");
    }
    
    private String introduzDadosFestival() {
        return Utils.readLineFromConsole("Introduza o Festival que pretende associar à Entidade anteriormente introduzida: ");
    }

    private void apresentaDados() {

        System.out.println("\nFestival: ");
        System.out.println(controller.getFestivalAsString());
        System.out.println("\nEntidade: ");
        System.out.println(controller.getEntidadeAsString());
        
    }
    
}
