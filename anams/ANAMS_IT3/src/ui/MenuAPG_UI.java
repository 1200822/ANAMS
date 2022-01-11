package ui;

import java.io.IOException;
import model.GestFest;
import utils.Utils;

/**
 *
 * @actor grupo2
 */

public class MenuAPG_UI
{
    private GestFest empresa;
    private String opcao;

    public MenuAPG_UI(GestFest empresa)
    {
        this.empresa = empresa;
    }

    public void run() throws IOException
    {
        do
        {
            System.out.println("###### MENU #####\n\n");
            System.out.println("1. Especificar Tipo de Entidade");
            System.out.println("2. Registar Entidade Colaboradora");
            System.out.println("3. Especificar Tipo de Bilhete");      
            System.out.println("4. Consultar Informação de um Festival");
            System.out.println("0. Sair");

            opcao = Utils.readLineFromConsole("Introduza opção: ");
 
            if( opcao.equals("1") )
            {
                UC01_EspecificarTipoEntidadeUI ui = new UC01_EspecificarTipoEntidadeUI(empresa);
                ui.run();
            }
            if( opcao.equals("2") )
            {
                UC02_RegistoEntidadeUI ui = new UC02_RegistoEntidadeUI(empresa);
                ui.run();
            }
            if( opcao.equals("3") )
            {
                UC03_EspecificarTipoBilheteUI ui = new UC03_EspecificarTipoBilheteUI(empresa);
                ui.run();
            }
            if( opcao.equals("4") )
            {
                UC04_ConsultarInformacaoFestivalUI ui = new UC04_ConsultarInformacaoFestivalUI(empresa);
                ui.run();
            }
            
        }
        while (!opcao.equals("0") );
    }
}

