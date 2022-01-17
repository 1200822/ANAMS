/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.IOException;
import model.GestFest;
import utils.Utils;

/**
 *
 * @author hugoqueiroz
 */
public class MenuUNR_UI {
  
    private GestFest empresa;
    private String opcao;

    public MenuUNR_UI(GestFest empresa)
    {
        this.empresa = empresa;
    }

    public void run() throws IOException
    {
        do
        {
            System.out.println("###### MENU #####\n\n");
            System.out.println("1. Comprar Bilhetes");
            System.out.println("0. Sair");

            opcao = Utils.readLineFromConsole("Introduza opção: ");

            if( opcao.equals("1") )
            {
              UC12_ComprarBilhetesUI ui = new UC12_ComprarBilhetesUI(empresa);
              ui.run();
            }
        }
        while (!opcao.equals("0") );
    }
}
