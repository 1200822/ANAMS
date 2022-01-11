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
import model.ProgramaDiario;
import model.ProgramacaoFestival;

public class UC09_DefinirProgramacaoFestival_Controller {
    private GestFest empresa;
    private Festival festival;
    private ProgramacaoFestival pf;
    private ProgramaDiario pd;

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

    public LocalDate getDataInicioFestival() {
        return festival.getDataInicioFestival();
    }

    public LocalDate getDataFimFestival() {
        return festival.getDataFimFestival();
    }

    public ProgramacaoFestival getPf() {
        return pf;
    }

    public void setPf(ProgramacaoFestival pf) {
        this.pf = pf;
    }

    public ProgramaDiario getPd() {
        return pd;
    }

    public void setPd(ProgramaDiario pd) {
        this.pd = pd;
    }

    public ArtistaBanda ProcurarArtista(String artista) {
         return empresa.procurarArtistaString(artista);
    }

}
