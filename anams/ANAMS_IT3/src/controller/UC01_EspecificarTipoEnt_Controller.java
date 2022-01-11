package controller;

import model.GestFest;
import model.TipoEntidade;

/**
 *
 * @actor grupo2
 */

public class UC01_EspecificarTipoEnt_Controller {
    private final GestFest empresa;
    private TipoEntidade tipoEntidade;

    public UC01_EspecificarTipoEnt_Controller(GestFest empresa) {
        this.empresa = empresa;
    }

    public void novoTipoEntidade() {
        tipoEntidade = new TipoEntidade();
    }

    public void setTipo(String tipo) {
        tipoEntidade.setDesignacao(tipo);
    }

    public String getTipoEntidadeAsString() {
        return this.tipoEntidade.toString();
    }

    public boolean registaTipoEntidade() {
        return this.empresa.registaTipoEntidade(this.tipoEntidade);
    }
}