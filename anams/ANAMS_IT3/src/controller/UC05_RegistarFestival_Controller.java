package controller;

import model.GestFest;
import model.Festival;
import model.Recinto;

/**
 *
 * @actor grupo2 
 */

public class UC05_RegistarFestival_Controller {
    private final GestFest empresa;
    private Festival festival;

    public UC05_RegistarFestival_Controller(GestFest empresa)
    {
        this.empresa = empresa;
    }
    public void novoFestival() {
        this.festival = empresa.novoFestival();
    }

    public void criarFestival(String tituloFestival, int edicao, String local, String data, Recinto recinto) {
     festival = new Festival (tituloFestival, edicao, local, data, recinto);
    }

    public boolean registaFestival() {
        return this.empresa.registaFestival(this.festival);
    }

    public String getFestivalAsString() {
        return  this.festival.toString();
    }

}