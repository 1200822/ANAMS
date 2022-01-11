/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.GestFest;
import model.Programacao;

/**
 *
 * @author hugoqueiroz
 */
public class UC10_ConsultarProgramacaoFestival_Controller {
    private GestFest empresa;
    private Programacao programacao;

    public UC10_ConsultarProgramacaoFestival_Controller(GestFest empresa) {
        this.empresa = empresa;
    }

    public String apresentaProgramacaoFestival() {
        return programacao.toString();
    }

    public void ProcurarReferenciaFestivalProgramacao(int refFestival) {
        this.programacao = empresa.procurarReferenciaFestivalProgramacao(programacao);
    }

    public String listaProgramacaoFestivalAsString() {
    }

    public void listaFestivalAsString() {
    }

}
