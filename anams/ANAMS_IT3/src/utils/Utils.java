/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utils;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.TipoEntidade;

/**
 *
 * @author Paulo Maio <pam@isep.ipp.pt>
 */
public class Utils
{
    static public String readLineFromConsole(String strPrompt)
    {
        try
        {
            System.out.println(strPrompt);

            InputStreamReader converter = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(converter);

            return in.readLine();
        } catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    static public Date readDateFromConsole(String strPrompt)
    {
        do
        {
            try
            {
                String strDate = readLineFromConsole(strPrompt);

                SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");

                Date date = df.parse(strDate);

                return date;
            } catch (ParseException ex)
            {
                Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (true);
    }
    
    static public boolean confirma(String sMessage) {
        String strConfirma;
        do {
            strConfirma = Utils.readLineFromConsole("\n" + sMessage + "\n");
        } while (!strConfirma.equalsIgnoreCase("s") && !strConfirma.equalsIgnoreCase("n"));

        return strConfirma.equalsIgnoreCase("s");
    }
    // Apresenta uma lista de objetos e coloca uma pergunta cujo texto é passado ao argumento sHeader
    static public Object apresentaESeleciona(List list,String sHeader)
    {
        apresentaLista(list,sHeader);
        return selecionaObject((ArrayList) list);
    }
    static public void apresentaLista(List list,String sHeader)
    {
        System.out.println(sHeader);

        int index = 0;
        for (Object o : list)
        {
            index++;

            System.out.println(index + ". " + o.toString());
        }
        System.out.println("");
        System.out.println("0 - Cancelar");
    }
    
    static public Object selecionaObject(ArrayList list)
    {
        String opcao;
        int nOpcao;
        do
        {
            nOpcao = Utils.IntFromConsole("Introduza a opção: ");
            
        } while (nOpcao < 0 || nOpcao > list.size());

        if (nOpcao == 0)
        {
            return null;
        } else
        {
            return list.get(nOpcao - 1);
        }
    }
    
    static public TipoEntidade selecionaTipoEnt(ArrayList <TipoEntidade>list)
    {
        String opcao;
        int nOpcao;
        do
        {
            nOpcao = Utils.IntFromConsole("Introduza o nrº do tipo de entidade que caracterize a que está a resgistar:");
            
        } while (nOpcao < 0 || nOpcao > list.size());

        if (nOpcao == 0)
        {
            System.out.println("Não selecionou um tipo!");
            return null;           
        } else
        {
            return list.get(nOpcao - 1);
        }
    }
    public static int IntFromConsole(String strPrompt)
    {
        do
        {
            try
            {
                String strInt = readLineFromConsole(strPrompt);

                int iInt = Integer.parseInt(strInt);

                return iInt;
            } catch (NumberFormatException ex)
            {
                //Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (true);
    }

    public static boolean confirma() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}