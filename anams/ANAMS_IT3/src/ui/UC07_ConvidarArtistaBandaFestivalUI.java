/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import controller.UC07_ConvidarArtistaBandaFestival_Controller;
import model.GestFest;
import utils.Utils;

/**
 *
 * @author hugoqueiroz
 */
public class UC07_ConvidarArtistaBandaFestivalUI {

    UC07_ConvidarArtistaBandaFestivalUI(GestFest empresa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
public class UC5_RegistoFestivalUI {

    private GestFest empresa;
    private UC07_ConvidarArtistaBandaFestival_Controller controller;

//    public UC5_RegistoFestivalUI( GestFest empresa )
//    {
//        this.empresa = empresa;
//        controller = new UC7_ConvidarArtistaBandaFestival_Controller(empresa);
//    }
//
//       public void run()
//    {
//        System.out.println("\nNovo Convite:");
//        controller.novoConvite();
//
//        introduzDados();
//
//        apresentaDados();
//
//        if (Utils.confirma("Confirma os dados do convite? (S/N)")) 
//        {
//            if (controller.realizaConvite()) {
//                System.out.println("Convite enviado com sucesso.");
//            } else {
//                System.out.println("Convite não realizado.");
//            }
//        }
//    }
//
//    private void introduzDados() {
//
//        String artista = Utils.readLineFromConsole("Introduza o nome do artista: ");
//
//        String email = Utils.readLineFromConsole("Introduza o e-mail do artista: ");
//
//        String dataEnvio = Utils.readLineFromConsole("Introduza a Data atual: ");
//
//        String dataLimite = Utils.readLineFromConsole("Introduza a Data limite: ");
//
//        
// 
//         empresa.listaTodosRecintos(empresa.getrecintos());
//                 
//        Recinto recinto = empresa.procuraRecinto(Utils.readLineFromConsole("Introduza o Recinto do Festival: "));
//
//        controller.criarFestival(tituloFestival, edicao, local, data, recinto);
//
//    }
//
//    private void apresentaDados() 
//    {
//        System.out.println("\nFestival:\n" + controller.getFestivalAsString());
//    }
//}

}}
