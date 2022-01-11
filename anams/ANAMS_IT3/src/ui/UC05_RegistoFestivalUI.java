package ui;

import controller.UC05_RegistarFestival_Controller;
import model.GestFest;
import model.Recinto;
import utils.Utils;

/**
 *
 * @actor grupo2 
 */

public class UC05_RegistoFestivalUI {

    private GestFest empresa;
    private UC05_RegistarFestival_Controller controller;

    public UC05_RegistoFestivalUI( GestFest empresa )
    {
        this.empresa = empresa;
        controller = new UC05_RegistarFestival_Controller(empresa);
    }

       public void run()
    {
        System.out.println("\nNovo Festival:");
        controller.novoFestival();

        introduzDados();

        apresentaDados();

        if (Utils.confirma("Confirma os dados do Festival? (S/N)")) 
        {
            if (controller.registaFestival()) {
                System.out.println("Festival registado com sucesso.");
            } else {
                System.out.println("Festival não registado.");
            }
        }
    }

    private void introduzDados() {

        String tituloFestival = Utils.readLineFromConsole("Introduza o Titulo do Festival: ");

        int edicao = Utils.IntFromConsole("Introduza a edição do Festival: ");

        String local = Utils.readLineFromConsole("Introduza o local onde vai ser realizado o Festival: ");

        String data = Utils.readLineFromConsole("Introduza a Data do Festival: ");

         empresa.listaTodosRecintos(empresa.getrecintos());
                 
        Recinto recinto = empresa.procuraRecinto(Utils.readLineFromConsole("Introduza o Recinto do Festival: "));

        controller.criarFestival(tituloFestival, edicao, local, data, recinto);

    }

    private void apresentaDados() 
    {
        System.out.println("\nFestival:\n" + controller.getFestivalAsString());
    }
}
