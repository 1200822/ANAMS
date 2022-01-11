/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Asus
 */
public class Convite {
    public enum Estado{
        sem_resposta,aceite,rejeitado,anulado
    }
    
    private int codigo;
    private Artista artista;
    private String nome;
    private String email;
    private DataHora dataConvite;
    private DataHora dataLimite;
    private Estado estado;
    
    private static int nroConvite=0;
    private static final String STRING_POR_OMISSAO="";
    
    public Convite(){
        this.codigo = nroConvite++;
        this.artista = new Artista();
        this.nome = STRING_POR_OMISSAO;
        this.email = STRING_POR_OMISSAO;
        this.dataConvite = new DataHora();
        this.dataLimite = new DataHora();
        this.estado = Estado.sem_resposta;
    }

    public Convite(Artista artista, String nome,String email, DataHora dataConvite, DataHora dataLimite, Estado estado) {
        this.codigo = nroConvite++; 
        this.artista = new Artista(artista);
        this.nome = nome;
        this.email = email;
        this.dataConvite = new DataHora(dataConvite);
        this.dataLimite = new DataHora(dataLimite);
        this.estado = estado;
    }
    
    public Convite(Convite convite){
        this.codigo = nroConvite++;
        this.artista = convite.artista;
        this.nome = convite.nome;
        this.email = convite.email;
        this.dataConvite = convite.dataConvite;
        this.dataLimite = convite.dataLimite;
        this.estado = convite.estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public Artista getArtista() {
        return artista;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public DataHora getDataConvite() {
        return dataConvite;
    }

    public DataHora getDataLimite() {
        return dataLimite;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataConvite(DataHora dataConvite) {
        this.dataConvite = dataConvite;
    }

    public void setDataLimite(DataHora dataLimite) {
        this.dataLimite = dataLimite;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public boolean valida(){
        return true;
    }

    @Override
    public String toString() {
        return "Convite{" + "codigo=" + codigo + ", artista=" + artista + ", nome=" + nome + ", email=" + email + ", dataConvite=" + dataConvite + ", dataLimite=" + dataLimite + ", estado=" + estado + '}';
    }
    
}
