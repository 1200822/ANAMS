/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ui;

import model.GestFest;

/**
 *
 * @actor grupo2 
 */

public class Main
{
    public static void main(String[] args)
    {
        try
        {   // Construção da empresa
            GestFest empresa = new GestFest("GestFest");

            MenuInicial_UI uiMenu = new MenuInicial_UI(empresa);

            uiMenu.run();
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
    }
}
