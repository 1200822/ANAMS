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
 * @actor grupo2 
 */

public class MenuRIF_UI
{
    private GestFest empresa;
    private String opcao;

    public MenuRIF_UI(GestFest empresa)
    {
        this.empresa = empresa;
    }

    public void run() throws IOException
    {
        do
        {
            System.out.println("###### MENU #####\n\n");
            System.out.println("1. Registar Festival");
            System.out.println("2. Associar Entidade Colaboradora a um Festival");
            System.out.println("3. Consultar Informação de um Festival");  
            System.out.println("4. Consultar Programacao de um Festival");
            System.out.println("0. Sair");


            opcao = Utils.readLineFromConsole("Introduza opção: ");

            if( opcao.equals("1") )
            {
                UC05_RegistoFestivalUI ui = new UC05_RegistoFestivalUI(empresa);
                ui.run();
            }
            
            if( opcao.equals("2") )
            {
                UC06_AssociarEntidadeUI ui = new UC06_AssociarEntidadeUI(empresa);
                ui.run();
            }
            
            if( opcao.equals("3") )
            {
                UC04_ConsultarInformacaoFestivalUI ui = new UC04_ConsultarInformacaoFestivalUI(empresa);
                ui.run();
            }
            
            if( opcao.equals("4") )
            {
                UC10_ConsultarProgramacaoFestivalUI ui = new UC10_ConsultarProgramacaoFestivalUI(empresa);
                ui.run();
            }
            
        }
        while (!opcao.equals("0") );
    }
}
