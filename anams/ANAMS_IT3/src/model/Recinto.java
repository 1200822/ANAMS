/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

public class Recinto {
    private int codigoRecinto;
    private String nomeRecinto;
    private String localizacaoRecinto;
    private ArrayList<Palco> palcosFestival;
    private int nroPalcos;
    private int lotacaoRecinto;

    private static int nroRecinto=0;
    
    private static final String STRING_POR_OMISSAO = "";
    private static final int INT_POR_OMISSAO = 0;

    public Recinto() {
        this.codigoRecinto=nroRecinto++;
        this.nomeRecinto = STRING_POR_OMISSAO;
        this.localizacaoRecinto = STRING_POR_OMISSAO;
        this.palcosFestival = new ArrayList<Palco>();
        this.nroPalcos = INT_POR_OMISSAO;
        this.lotacaoRecinto = INT_POR_OMISSAO;
    }

    public Recinto(String nomeRecinto, String localizacaoRecinto, int lotacaoRecinto) {
        this.codigoRecinto=nroRecinto;
        this.nomeRecinto = nomeRecinto;
        this.localizacaoRecinto = localizacaoRecinto;
        this.palcosFestival = new ArrayList<Palco>();
        this.nroPalcos = palcosFestival.size();
        this.lotacaoRecinto = lotacaoRecinto;
    }

    public Recinto(Recinto recinto) {
        this.codigoRecinto=nroRecinto++;
        this.nomeRecinto = recinto.nomeRecinto;
        this.localizacaoRecinto = recinto.localizacaoRecinto;
        this.palcosFestival = recinto.palcosFestival;
        this.nroPalcos = recinto.palcosFestival.size();
        this.lotacaoRecinto = recinto.lotacaoRecinto;
    }
    
    public int getCodigoRecinto(){
        return codigoRecinto;
    }

    public String getNomeRecinto() {
        return nomeRecinto;
    }

    public String getLocalizacaoRecinto() {
        return localizacaoRecinto;
    }

    public ArrayList<Palco> getPalcosFestival() {
        return palcosFestival;
    }

    public int getNroPalcos() {
        return nroPalcos;
    }

    public int getLotacaoRecinto() {
        return lotacaoRecinto;
    }
    
    public void setCodigoRecinto(int codigo){
        this.codigoRecinto=codigo;
    }

    public void setNomeRecinto(String nomeRecinto) {
        this.nomeRecinto = nomeRecinto;
    }

    public void setLocalizacaoRecinto(String localizacaoRecinto) {
        this.localizacaoRecinto = localizacaoRecinto;
    }

    public void setPalcosFestival(ArrayList<Palco> palcosFestival) {
        this.palcosFestival = palcosFestival;
    }

    public void setNroPalcos(int nroPalcos) {
        this.nroPalcos = nroPalcos;
    }

    public void setLotacaoRecinto(int lotacaoRecinto) {
        this.lotacaoRecinto = lotacaoRecinto;
    }
    
    public boolean valida(){
        return true;
    }
    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Recinto other = (Recinto) obj;
        return this.nomeRecinto.equalsIgnoreCase(other.nomeRecinto)
                && this.localizacaoRecinto.equals(other.localizacaoRecinto)
                && this.palcosFestival.equals(other.palcosFestival)
                && this.nroPalcos == other.nroPalcos
                && this.lotacaoRecinto == other.lotacaoRecinto;
    }

    @Override
    public String toString() {
        return "Recinto{" + "codigoRecinto=" + codigoRecinto + ", nomeRecinto=" + nomeRecinto + ", localizacaoRecinto=" + localizacaoRecinto + ", palcosFestival=" + palcosFestival + ", nroPalcos=" + nroPalcos + ", lotacaoRecinto=" + lotacaoRecinto + '}';
    }
}