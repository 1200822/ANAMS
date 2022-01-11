package controller;

import model.Festival;
import model.GestFest;

public class UC04_ConsultarInformacaoFestival_Controller {
    private final GestFest empresa;
    private Festival festival;
    
    public UC04_ConsultarInformacaoFestival_Controller(GestFest empresa){
        this.empresa=empresa;
    }
    
    public void procurarFestival(String festival){
        this.festival=empresa.procurarFestival(festival);
    }
    
    public String getInformacaoFestivalAsString(){
        return this.festival.toString();
    }
}
