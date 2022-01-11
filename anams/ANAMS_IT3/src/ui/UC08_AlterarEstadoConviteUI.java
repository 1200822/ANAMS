/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.UC08_AlterarEstadoConvite_Controller;
import model.GestFest;
import utils.Utils;

/**
 *
 * @author hugoqueiroz
 */
public class UC08_AlterarEstadoConviteUI {
    
    private GestFest empresa;
    private UC08_AlterarEstadoConvite_Controller controller;

    UC08_AlterarEstadoConviteUI(GestFest empresa) {
        this.empresa = empresa;
        this.controller = new UC08_AlterarEstadoConvite_Controller(empresa);
    }

    public void run() {
        
        System.out.println("\n Alterar estado do convite:");
        
        System.out.println("Lista de convites: ");
        
//        if (controller.getListaConvites().isEmpty()) {
//            System.out.println("\n Não existem convites para alterar o estado.");
//        } else {
//            System.out.println(controller.getListaConvites());
//            introduzDados();
//        }
    }
    
    private void introduzDados() {
        int cod = Utils.IntFromConsole("Introduza o código do estado do convite: ");

        if (controller.obterConvite(cod) != null) {

            String estado = Utils.readLineFromConsole("Qual o estado do convite? (Concluído/Concluído)");
            
            if (estado.equalsIgnoreCase("concluido")) {
                controller.setDados(estado);

//                apresentaDados();
                
//                if (Utils.confirma("Confirma o novo estado do convite? (S/N)")) {
//                    if (controller.valida()) {
//                        System.out.println("Estado foi alterado com sucesso.");
//                    } else {
//                        System.out.println("Estado não foi alterado.");
//                    }
//                }
//            } else {
//                System.out.println("Introduza um estado disponivel!");
//            }
//        } else {
//            System.out.println("Código de estado de convite inválido.");
        }
   }

//    private void apresentaDados() {
//        System.out.println(controller.obterDados());
//    }
}
    
}
            


