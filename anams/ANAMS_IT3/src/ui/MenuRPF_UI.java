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
public class MenuRPF_UI {
  
    private GestFest empresa;
    private String opcao;

    public MenuRPF_UI(GestFest empresa)
    {
        this.empresa = empresa;
    }

    public void run() throws IOException
    {
        do
        {
            System.out.println("###### MENU #####\n\n");
            System.out.println("1. Convidar Artista/Banda para um Festival");
            System.out.println("2. Alterar o estado do Convite ao Artista/Banda ");
            System.out.println("3. Definir Programação de um Festival");      
            System.out.println("4. Consultar Programação de um Festival");
            System.out.println("0. Sair");

            opcao = Utils.readLineFromConsole("Introduza opção: ");

            if( opcao.equals("1") )
            {
              UC07_ConvidarArtistaBandaFestivalUI ui = new UC07_ConvidarArtistaBandaFestivalUI(empresa);
              ui.run();
            }
            
            if( opcao.equals("2") )
            {
                UC08_AlterarEstadoConviteUI ui = new UC08_AlterarEstadoConviteUI(empresa);
                ui.run();
            }
            
            if( opcao.equals("3") )
            {
                UC09_DefinirProgramacaoFestivalUI ui = new UC09_DefinirProgramacaoFestivalUI(empresa);
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

