package controller;

import java.util.ArrayList;
import model.Entidade;
import model.Festival;
import model.GestFest;

public class UC06_AssociarEntidade_Controller {
    private GestFest gestfest;
    private Festival festival;
    private Entidade entidade;

    private GestFest empresa;

    public UC06_AssociarEntidade_Controller(GestFest empresa) {
        this.empresa = empresa;
    }

    public void consultaFestival(String festival) {
        this.festival = gestfest.procurarFestival(festival);
    }

    public void consultaEntidade(int referencia) {
        this.entidade = gestfest.procurarEntidade(referencia);
    }

    public boolean associarFestivalEntidade(){
        ArrayList<Entidade> e = this.festival.getEntColaboradoras();
        e.add(entidade);
        this.festival.setEntColaboradoras(e);
        return true;
    }

    public String getFestivalAsString(){
        return this.festival.toString();
    }

    public String getEntidadeAsString(){
        return this.entidade.toString();
    }
}
