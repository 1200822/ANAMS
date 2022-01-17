/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author danie
 */
public class Programacao {
    private int ref;
    private Festival festival;
    private List<LocalDate> data;
    private HashSet<ProgDia> progDia;

    private static int contador = 0;

    public Programacao() {
        this.ref += contador;
        this.festival = new Festival();
        this.data = new ArrayList<>();
        this.progDia = new HashSet<>();
    }

    public Programacao(Festival festival, List<LocalDate> data, HashSet<ProgDia> progDia, ArtistaBanda artista, Palco palco) {
        this.ref += contador;
        this.festival = new Festival(festival);
        this.data = new ArrayList<>(data);
        this.progDia = new HashSet<ProgDia>(progDia);
    }

    public Programacao(Programacao pfestival) {
        this.ref = pfestival.ref;
        this.festival = new Festival(pfestival.festival);
        this.data = new ArrayList<>(pfestival.data);
        this.progDia = new HashSet<ProgDia>(pfestival.progDia);
    }

    public int getRef() {
        return ref;
    }

    public Festival getFestival() {
        return festival;
    }

    public List<LocalDate> getData() {
        return new ArrayList<>(data);
    }

    public HashSet<ProgDia> getProgDia() {
        return progDia;
    }

    public void setFestival(Festival festival) {
        this.festival = festival;
    }

    public void setData(List<LocalDate> data) {
        this.data = new ArrayList<>(data);
    }

    public void setProgramadia(HashSet<ProgDia> programadia) {
        this.progDia = progDia;
    }
    
    public boolean valida(){
        return true;
    }

    @Override
    public String toString() {
        return "ProgramacaoFestival:" + "\n - Referência:" + ref
                                      + "\n - Festival:" + festival 
                                      + "\n - Programa Diário:" + progDia;
    }
}
