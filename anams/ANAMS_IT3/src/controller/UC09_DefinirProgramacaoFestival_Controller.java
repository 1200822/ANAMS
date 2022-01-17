/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.time.LocalDate;
import model.ArtistaBanda;
import model.Festival;
import model.GestFest;
import model.ProgDia;
import model.Programacao;

public class UC09_DefinirProgramacaoFestival_Controller {
    private GestFest empresa;
    private Festival festival;
    private Programacao pfestival;
    private ProgDia pdia;

    public UC09_DefinirProgramacaoFestival_Controller(GestFest empresa) {
        this.empresa = empresa;
    }

    public void ListarFestivais() {
        empresa.getFestivaisAsString();
    }

    public void ProcurarFestival(String nome) {
        this.festival = empresa.procurarFestivalDesgn(nome);
    }

    public Festival getFestival() {
        return this.festival;
    }

    public LocalDate getDataInicio() {
        return festival.getDataInicio();
    }

    public LocalDate getDataFim() {
        return festival.getDataFim();
    }

    public Programacao getPfestival() {
        return pfestival;
    }

    public void setPf(Programacao pf) {
        this.pfestival = pfestival;
    }

    public ProgDia getPdia() {
        return pdia;
    }

    public void setPdia(ProgDia pdia) {
        this.pdia = pdia;
    }

    public ArtistaBanda ProcurarArtista(String artista) {
         return empresa.procurarArtistaString(artista);
    }

}
