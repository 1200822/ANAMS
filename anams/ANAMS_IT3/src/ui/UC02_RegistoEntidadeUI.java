package ui;

import java.util.Scanner;
import controller.UC02_RegistarEntidade_Controller;
import java.util.ArrayList;
import model.GestFest;
import model.TipoEntidade;
import utils.Utils;

/**
 *
 * @actor grupo2 
 */ 

public class UC02_RegistoEntidadeUI {

    private GestFest empresa;
    private UC02_RegistarEntidade_Controller controller;

    public UC02_RegistoEntidadeUI( GestFest empresa ) {
        this.empresa = empresa;
        controller = new UC02_RegistarEntidade_Controller(empresa);
    }

       public void run()
    {
        System.out.println("\nNova Entidade:");
        controller.novaEntidade();

        introduzDados();

        apresentaDados();

        if (Utils.confirma("Confirma os dados da Entidade? (S/N)")) 
        {
            if (controller.registaEntidade()) {
                System.out.println("Entidade registada com sucesso.");
            } else {
                System.out.println("Entidade não registada.");
            }
        }
    }

    private void introduzDados(){
        String designacao=Utils.readLineFromConsole("Introduza a designação da Entidade: ");
        do{
            String tipoEntidade=Utils.readLineFromConsole("Introduza o Tipo de Entidade: ");
            controller.adicionaTipoEntidade(new TipoEntidade(tipoEntidade));
        }while(Utils.confirma("Confirma os dados? (S/N)"));
        
        controller.setDesignacao(designacao);
    }
    
    private void apresentaDados(){
        System.out.println("\nEntidade:\n" + controller.getEntidadeAsString());
    }


}