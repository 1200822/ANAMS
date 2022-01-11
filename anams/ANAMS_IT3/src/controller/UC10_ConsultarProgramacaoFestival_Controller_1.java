/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Festival;
import model.GestFest;
import model.ProgramaDiario;
import model.ProgramacaoFestival;

/**
 *
 * @author danie
 */
public class UC10_ConsultarProgramacaoFestival_Controller_1 {
    private final GestFest empresa;
    private Festival festival;
    private ProgramaDiario pd;
    private ProgramacaoFestival pf;

    public UC10_ConsultarProgramacaoFestival_Controller_1(GestFest empresa) {
        this.empresa = empresa;
    }

    public void ProcurarFestival(String nome) {
        this.festival = empresa.procurarFestivalDesgn(nome);
    }

    public void ProcurarReferenciaFestival(int referencia) {
        this.festival = empresa.procurarReferenciaFestival(referencia);
    }

    public String listaFestivalAsString() {
        return this.empresa.getFestivaisAsString();
    }

    public boolean validaFestival(Festival festival) {
        return this.empresa.valida(festival);
    }

    public String listaProgramacaoAsString() {
        return this.empresa.procurarProgramacaoFestival(this.festival);
    }
}

