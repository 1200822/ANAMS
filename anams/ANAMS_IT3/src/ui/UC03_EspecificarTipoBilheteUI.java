package ui;

import controller.UC03_EspecificarTipoBilhete_Controller;
import model.GestFest;
import model.TipoBilhete;
import utils.Utils;

/**
 *
 * @actor grupo2 
 */

public class UC03_EspecificarTipoBilheteUI {
   
    private GestFest empresa;
    private UC03_EspecificarTipoBilhete_Controller controller;

    public UC03_EspecificarTipoBilheteUI( GestFest empresa ) {
        this.empresa = empresa;
        controller = new UC03_EspecificarTipoBilhete_Controller(empresa);
    }

    public void run()
    {
        System.out.println("\nEspecificar Tipo de Bilhete:");
        
        do{
            controller.adicionaTipoBilhete(new TipoBilhete(introduzDados()));
        }while(Utils.confirma("Deseja adicionar mais tipos de Bilhete (S/N)?"));

        apresentaDados();

        if (Utils.confirma("Confirma os dados? (S/N)")){
            if (controller.registaTipoBilhete()) {
                System.out.println("Tipo de bilhete registado com sucesso.");
            }else {
                System.out.println("Tipo de bilhete não registado.");
            }
        }
    }
    
    private String introduzDados() {
        return Utils.readLineFromConsole("Introduza o tipo de bilhete: ");
    }
    
    private void apresentaDados() 
    {
        System.out.println("\nTipo de Bilhete:\n" + controller.getTipoBilheteAsString());
    }
 
}
