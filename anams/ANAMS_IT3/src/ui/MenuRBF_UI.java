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
public class MenuRBF_UI {
  
    private GestFest empresa;
    private String opcao;

    public MenuRBF_UI(GestFest empresa)
    {
        this.empresa = empresa;
    }

    public void run() throws IOException
    {
        do
        {
            System.out.println("###### MENU #####\n\n");
            System.out.println("1. Registar Planeamento da Bilhética");
            System.out.println("2. Consultar Vendas de Bilhetes");
            System.out.println("0. Sair");

            opcao = Utils.readLineFromConsole("Introduza opção: ");

            if( opcao.equals("1") )
            {
              UC11_RegistarPlaneamentoBilheticaUI ui = new UC11_RegistarPlaneamentoBilheticaUI(empresa);
              ui.run();
            }
            
            if( opcao.equals("2") )
            {
              UC13_ConsultarVendaBilhetesUI ui = new UC13_ConsultarVendaBilhetesUI(empresa);
              ui.run();
            }
        }
        while (!opcao.equals("0") );
    }
}