package controller;

import java.time.LocalDate;
import model.Festival;
import model.GestFest;
import model.Recinto;


public class UC05_RegistarFestival_Controller {
    private final GestFest empresa;
    private Festival festival;
    
    public UC05_RegistarFestival_Controller(GestFest empresa){
        this.empresa=empresa;
    }
    
    public void novoFestival(){
        this.festival=empresa.novoFestival();
    }
    
    public String getDsgFestival(){
        return this.festival.getDsgFestival();
    }
    
    public String getEdicao(){
        return this.festival.getEdicao();
    }
    
    public LocalDate getDataInicio(){
        return this.festival.getDataInicio();
    }
    
    public LocalDate getDataFim(){
        return this.festival.getDataFim();
    }
    
    public Recinto getRecinto(){
        return new Recinto(this.festival.getRecinto());
    }
    
    public void setDsgFestival(String dsgFestival){
        this.festival.setDsgFestival(dsgFestival);
    }
    
    public void setEdicao(String edicao){
        this.festival.setEdicao(edicao);
    }
    
    public void setDataInicio(LocalDate dataInicio){
        this.festival.setDataInicio(dataInicio);
    }
    
    public void setDataFim(LocalDate dataFim){
        this.festival.setDataFim(dataFim);
    }
    
    public void setRecinto(Recinto recinto){
        this.festival.setRecinto(recinto);
    }
    
    public boolean registaFestival(){
        return this.empresa.registaFestival(this.festival);
    }
    
    public String getFestivalAsString(){
        return this.festival.toString();
    }
}
