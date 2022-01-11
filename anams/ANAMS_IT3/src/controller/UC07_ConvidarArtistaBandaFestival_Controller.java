/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import model.Artista;
import model.Convite;
import model.Convite.Estado;
import model.Festival;
import model.GestFest;
import utilitarios.DataHora;

/**
 *
 * @author danie
 */
public class UC07_ConvidarArtistaBandaFestival_Controller {
    private final GestFest empresa;
    private Convite convite;
    private Festival festival;
    private Artista artista;
    
    public UC07_ConvidarArtistaBandaFestival_Controller(GestFest empresa){
        this.empresa = empresa;
    }
    
    public void novoConvite(){
        this.convite = festival.novoConvite();
    }
    
    public Artista getArtistaConvite(){
        return this.convite.getArtista();
    }
    
    public String getNomeArtistaConvite(){
        return this.convite.getNome();
    }
    
    public String getEmailArtistaConvite(){
        return this.convite.getEmail();
    }
    
    public DataHora getDataConvite(){
        return this.convite.getDataConvite();
    }
    
    public DataHora getDataLimiteConvite(){
        return this.convite.getDataLimite();
    }
    
    public Estado getEstadoConvite(){
        return this.convite.getEstado();
    }
    
    public void setArtistaConvite(Artista artista){
        this.convite.setArtista(artista);
    }
    
    public void setNomeArtistaConvite(String nome){
        this.convite.setNome(nome);
    }
    
    public void setEmailArtistaConvite(String email){
        this.convite.setEmail(email);
    }
    
    public void setDataConvite(DataHora dataConvite){
        this.convite.setDataConvite(dataConvite);
    }
    
    public void setDataLimiteConvite(DataHora dataLimite){
        this.convite.setDataLimite(dataLimite);
    }
    
    public void setEstadoConvite(Estado estado){
        this.convite.setEstado(estado);
    }
    
    public void novoArtista(){
        this.artista = empresa.novoArtista();
    }
    
    public String getEmailArtista(){
        return this.artista.getEmail();
    }
    
    public String getNomeArtista(){
        return this.artista.getNome();
    }
    
    public String getNroContribuinteArtista(){
        return this.artista.getNroContribuinte();
    }
    
    public String getNroTelemovelArtista(){
        return this.artista.getNroTelemovel();
    }
    
    public void setEmailArtista(String email){
        this.artista.setEmail(email);
    }
    
    public void setNomeArtista(String nome){
        this.artista.setNome(nome);
    }
    
    public void setNroContribuinteArtista(String nroContribuinte){
        this.artista.setNroContribuinte(nroContribuinte);
    }
    
    public void setNroTelemovelArtista(String nroTelemovel){
        this.artista.setNroTelemovel(nroTelemovel);
    }
    
    public boolean registaArtista(Artista artista){
        return this.empresa.registaArtista(artista);
    }
    
    public void consultaFestival(String festival) {
        this.festival = empresa.procurarFestival(festival);
    }
    
    public void consultaArtista(int codigo){
        this.artista = empresa.procurarArtistaInt(codigo);
    }
    
    public boolean registaConvite(){
        return this.festival.registaConvite(this.convite);
    }
    
    public Artista getArtista(){
        return this.artista;
    }
    
    public String getFestivaisAsString(){
        return empresa.getListaFestivaisAsString();
    }
    
    public String getArtistasAsString(){
        return empresa.getListaArtistasAsString();
    }
    
    public String getConviteAsString(){
        return this.convite.toString();
    }
}
