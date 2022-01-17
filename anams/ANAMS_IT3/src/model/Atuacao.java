/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.Duration;
import java.time.LocalDateTime;


public class Atuacao {
    private int cod;
    private ArtistaBanda artista;
    private LocalDateTime dataInicio;
    private LocalDateTime dataFim;
    private Duration duracao;
    private Palco palco;
    
    private static int numeroAtuacao=0;
    private static final int INT_POR_OMISSAO=0;
    
    public Atuacao(){
        this.cod = numeroAtuacao++;
        this.artista = new ArtistaBanda();
        this.dataInicio = LocalDateTime.now();
        this.dataFim = LocalDateTime.now();
        this.duracao = Duration.ZERO;
        this.palco = new Palco();
    }

    public Atuacao(ArtistaBanda artista, LocalDateTime dataInicio,LocalDateTime dataFim,Duration duracao, Palco palco) {
        this.cod = numeroAtuacao++;
        this.artista = new ArtistaBanda(artista);
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.duracao = duracao;
        this.palco = new Palco(palco);
    }
    
    public Atuacao(Atuacao atuacao){
        this.cod = numeroAtuacao++;
        this.artista = atuacao.artista;
        this.dataInicio = atuacao.dataInicio;
        this.dataFim = atuacao.dataFim;
        this.duracao = atuacao.duracao;
        this.palco = atuacao.palco;
    }

    public int getCod() {
        return cod;
    }

    public ArtistaBanda getArtistaBanda() {
        return artista;
    }

    public LocalDateTime getDataInicio() {
        return dataInicio;
    }
    
    public LocalDateTime getDataFim(){
        return dataFim;
    }

    public Duration getDuracao() {
        return duracao;
    }

    public Palco getPalco() {
        return palco;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setArtistaBanda(ArtistaBanda artista) {
        this.artista = new ArtistaBanda(artista);
    }

    public void setDataInicio(LocalDateTime dataInicio) {
        this.dataInicio = dataInicio;
    }
    
    public void setDataFim(LocalDateTime dataFim){
        this.dataFim = dataFim;
    }

    public void setDuracao(Duration duracao) {
        this.duracao = duracao;
    }

    public void setPalco(Palco palco) {
        this.palco = new Palco(palco);
    }
    
    public boolean valida(){
        return true;
    }

    @Override
    public String toString() {
        return "Atuação:" + "\n- Código:" + cod 
                          + "\n- Artista:" + artista 
                          + "\n- Data Início:" + dataInicio 
                          + "\n- Duração:" + duracao 
                          + "\n- Palco:" + palco;
    }
    
}
