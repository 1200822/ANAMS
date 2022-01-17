
package model;

import utils.DataHora;

/**
 *
 * @author grupo2
 */
public class Convite {
    
    public enum EstadoConvite{
        sem_resposta0,aceite1,rejeitado2,anulado3
    }
    
    private int cod;
    private ArtistaBanda artista;
    private String nome;
    private String email;
    private DataHora dataConvite;
    private DataHora dataLimite;
    private EstadoConvite estadoConvite;
    
    private static int numeroConvite=0;
    private static final String STRING_POR_OMISSAO="";
    
    public Convite(){
        this.cod = numeroConvite++;
        this.artista = new ArtistaBanda();
        this.nome = STRING_POR_OMISSAO;
        this.email = STRING_POR_OMISSAO;
        this.dataConvite = new DataHora();
        this.dataLimite = new DataHora();
        this.estadoConvite = EstadoConvite.sem_resposta0;
    }

    public Convite(ArtistaBanda artista, String nome,String email, DataHora dataConvite, DataHora dataLimite, EstadoConvite estadoConvite) {
        this.cod = numeroConvite++; 
        this.artista = new ArtistaBanda(artista);
        this.nome = nome;
        this.email = email;
        this.dataConvite = new DataHora(dataConvite);
        this.dataLimite = new DataHora(dataLimite);
        this.estadoConvite = estadoConvite;
    }
    
    public Convite(Convite convite){
        this.cod = numeroConvite++;
        this.artista = convite.artista;
        this.nome = convite.nome;
        this.email = convite.email;
        this.dataConvite = convite.dataConvite;
        this.dataLimite = convite.dataLimite;
        this.estadoConvite = convite.estadoConvite;
    }

    public int getCod() {
        return cod;
    }

    public ArtistaBanda getArtistaBanda() {
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

    public EstadoConvite getEstado() {
        return estadoConvite;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setArtistaBanda(ArtistaBanda artista) {
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

    public void setEstadoConvite(EstadoConvite estadoConvite) {
        this.estadoConvite = estadoConvite;
    }
    
    public boolean valida(){
        return true;
    }

    @Override
    public String toString() {
        return "Convite:" + "\n- Código Convite:" + cod 
                          + "\n- Artista/Banda:" + artista 
                          + "\n- Nome:" + nome 
                          + "\n- Email:" + email 
                          + "\n- Data Convite:" + dataConvite 
                          + "\n- Data Limite:" + dataLimite 
                          + "\n- Estado do Convite:" + estadoConvite;
    }
    
}
