/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.HashSet;

    public class ProgDia {
    private int ref;
    private Festival festival;
    private LocalDate data;
    private HashSet<Atuacao> lstAtuacoes;

    private static int contador = 0;

    public ProgDia() {
        this.ref += contador;
        this.festival = new Festival();
        this.data = LocalDate.now();
        this.lstAtuacoes = new HashSet<>();
    }

    public ProgDia(Festival festival, LocalDate data) {
        this.ref += contador;
        this.festival = new Festival(festival);
        this.data = data;
        this.lstAtuacoes = new HashSet<>();
    }

    public ProgDia(Festival festival, LocalDate data, HashSet<Atuacao> lsAtuacaos) {
        this.ref += contador;
        this.festival = new Festival(festival);
        this.data = data;
        this.lstAtuacoes = new HashSet<Atuacao>(lstAtuacoes);
    }

    public ProgDia(ProgDia progd) {
        this.ref = progd.ref;
        this.festival = new Festival(progd.festival);
        this.data = progd.data;
        this.lstAtuacoes = new HashSet<Atuacao>(progd.lstAtuacoes);
    }

    public int getReferencia() {
        return ref;
    }

    public Festival getFestival() {
        return festival;
    }

    public LocalDate getData() {
        return data;
    }

    public HashSet<Atuacao> getLstAtuacoes() {
        return lstAtuacoes;
    }

    public void setFestival(Festival festival) {
        this.festival = festival;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setLstAtuacoes(HashSet<Atuacao> lstAtuacoes) {
        this.lstAtuacoes = lstAtuacoes;
    }

    @Override
    public String toString() {
        return "ProgramaDiario:" + "\n - Referencia:" + ref 
                                 + "\n - Festival:" + festival 
                                 + "\n - Data:" + data 
                                 + "\n - Lista de Atuações:" + lstAtuacoes;
    }
}
