package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @actor grupo2 
 */

public class GestFest
{
    private final List<Festival> lstFestivais;
    private final List<TipoEntidade> lstTiposEntidade;
    private final List<Entidade> lstEntidades;
    private final List<TipoBilhete> lstTiposBilhete;
    private final List<Recinto> lstRecintos;
    private final List<Palco> lstPalcos;
    private final List<ArtistaBanda> lstArtistas;
    private final List<ProgramacaoFestival> lstProgramacaoFestival;
    private String designacao;

    public GestFest(String designacao)
    {
        this.designacao = designacao;
        this.lstTiposEntidade = new ArrayList<>();
        this.lstFestivais = new ArrayList<>();
        this.lstEntidades = new ArrayList<>();
        this.lstTiposBilhete = new ArrayList<>();
        this.lstRecintos = new ArrayList<>();
        this.lstPalcos = new ArrayList<>();
        this.lstArtistas = new ArrayList<>();
        this.lstProgramacaoFestival = new ArrayList<>();
    }
    
    private boolean adicionaTipoEntidade(TipoEntidade tipo)
    {
        return lstTiposEntidade.add(tipo);
    }
    
    private boolean adicionaFestival(Festival festival){
        return lstFestivais.add(festival);
    }
    
    private boolean adicionaEntidade(Entidade entidade){
        return lstEntidades.add(entidade);
    }
    
    private boolean adicionaTipoBilhete(TipoBilhete tipo){
        return lstTiposBilhete.add(tipo);
    }
    
    private boolean adicionaRecinto(Recinto recinto){
        return lstRecintos.add(recinto);
    }
    
    private boolean adicionaPalco(Palco palco){
        return lstPalcos.add(palco);
    }
    
    private boolean adicionaArtista(ArtistaBanda artista){
        return lstArtistas.add(artista);
    }
    
    private boolean adicionaProgramaFestival(ProgramacaoFestival programaFestival){
        return lstProgramacaoFestival.add(programaFestival);
    }
    
    public List<TipoEntidade> getListaTipoEntidades()
    {
       return this.lstTiposEntidade;
    }
    
    public List<Recinto> getListaRecintos(){
        return this.lstRecintos;
    }
    
    public List<Palco> getListaPalcos(){
        return this.lstPalcos;
    }
    
    public List<ArtistaBanda> getListaArtistas(){
        return this.lstArtistas;
    }
    
    public List<Festival> getListaFestivais(){
        return this.lstFestivais;
    }
    
    public List<ProgramacaoFestival> getListaProgramacaoFestival(){
        return this.lstProgramacaoFestival;
    }
    
    public String getListaFestivaisAsString(){
        for (Festival f: lstFestivais) {
            return f.toString();
        }
        return null;
    }
    
    public String getListaArtistasAsString(){
        for (ArtistaBanda a: lstArtistas) {
            return a.toString();
        }
        return null;
    }
    
    public TipoEntidade novoTipoEntidade()
    {
        return new TipoEntidade();
    }
    
    public Festival novoFestival(){
        return new Festival();
    }
    
    public Entidade novaEntidade(){
        return new Entidade();
    }
    
    public TipoBilhete novoTipoBilhete(){
        return new TipoBilhete();
    }
    
    public Recinto novoRecinto(){
        return new Recinto();
    }
    
    public Palco novoPalco(){
        return new Palco();
    }
    
    public ArtistaBanda novoArtista(){
        return new ArtistaBanda();
    }
    
    public ProgramacaoFestival novaProgramacaoFestival(){
        return new ProgramacaoFestival();
    }
    
    // Validação global
    public boolean valida(TipoEntidade tipo)
    {
        boolean bRet = false;
        if (tipo.valida())
        {
           // Escrever aqui o código de validação
        
           //
           bRet = true; 
        }
        return bRet;
    }
    
    public boolean valida(Festival festival)
    {
        boolean bRet = false;
        if (festival.valida())
        {
           // Escrever aqui o código de validação
        
           //
           bRet = true; 
        }
        return bRet;
    }
     
    public boolean valida(Entidade entidade)
    {
        boolean bRet = false;
        if (entidade.valida())
        {
           // Escrever aqui o código de validação
        
           //
           bRet = true; 
        }
        return bRet;
    }
     
    public boolean valida(TipoBilhete tipoBilhete)
    {
        boolean bRet = false;
        if (tipoBilhete.valida())
        {
           // Escrever aqui o código de validação
        
           //
           bRet = true; 
        }
        return bRet;
    }
     
    public boolean valida(Recinto recinto)
    {
        boolean bRet = false;
        if (recinto.valida())
        {
           // Escrever aqui o código de validação
        
           //
           bRet = true; 
        }
        return bRet;
    }

    public boolean valida(Palco palco)
    {
        boolean bRet = false;
        if (palco.valida())
        {
           // Escrever aqui o código de validação
        
           //
           bRet = true; 
        }
        return bRet;
    }

    public boolean valida(ProgramacaoFestival programacaoFestival){
         boolean bRet = false;
         if(programacaoFestival.valida()){
            // Escrever aqui o código de validação
        
           //
           bRet = true;
         }
         return bRet;
     }
    
    public boolean registaTipoEntidade(TipoEntidade tipo)
    {
        if (this.valida(tipo))
        {
           return adicionaTipoEntidade(tipo);
        }
        return false;
    }
    
    public boolean registaFestival(Festival festival){
        if(this.valida(festival)){
            return adicionaFestival(festival);
        }
        return false;
    }
    
    public boolean registaEntidade(Entidade entidade){
        if(this.valida(entidade)){
            return adicionaEntidade(entidade);
        }
        return false;
    }
    
    public boolean registaTipoBilhete(TipoBilhete tipoBilhete){
        if(this.valida(tipoBilhete)){
            return adicionaTipoBilhete(tipoBilhete);
        }
        return false;
    }
    
    public boolean registaRecinto(Recinto recinto){
        if(this.valida(recinto)){
            return adicionaRecinto(recinto);
        }
        return false;
    }

    public boolean registaPalco(Palco palco){
        if(this.valida(palco)){
            return adicionaPalco(palco);
        }
        return false;
    }
    
    public boolean registaArtista(ArtistaBanda artista){
        if(this.valida(artista)){
            return adicionaArtista(artista);
        }
        return false;
    }    
    
    public boolean registaProgramacaoFestival(ProgramacaoFestival programacaoFestival){
        if(this.valida(programacaoFestival)){
            return adicionaProgramaFestival(programacaoFestival);
        }
        return false;
    }
    
    public Festival procurarFestival(String festival){
        for (Festival f:lstFestivais) {
            if (f.getDesignacaoFestival().equals(festival)) {
                return f;
            }
        }
        return null;
    }
    
    public Festival procurarFestivalDesgn(String festival) {
        for (Festival f : lstFestivais) {
            if (f.getDesignacaoFestival().equals(festival)) {
                return f;
            }
        }
        return null;
    }
    
    public Recinto procurarRecinto(int codigoRecinto){
        Recinto recinto=new Recinto();
        for (Recinto r: lstRecintos) {
            if(codigoRecinto == r.getCodigoRecinto()){
                recinto=r;
            }
        }
        return recinto;
    }

    public Entidade procurarEntidade(int referencia){
        for(Entidade e : lstEntidades){
            if(e.getReferencia() == referencia){
                return e;
            }
        }
        return new Entidade();
    }
    
    public ArtistaBanda procurarArtistaInt(int codigo){
        for (ArtistaBanda a : lstArtistas) {
            if(a.getCodigo() == codigo){
                return a;
            }
        }
        return new ArtistaBanda();
    }
    
    public ArtistaBanda procurarArtistaString(String nome) {
        ArtistaBanda artista = new ArtistaBanda();
        for (ArtistaBanda a : lstArtistas) {
            if (nome.equalsIgnoreCase(a.getNome())) {
                artista = a;
            }
        }
        return artista;
    }
    
    public Festival procurarReferenciaFestival(int referenciaFestival) {
        for (Festival f : lstFestivais) {
            if (f.getReferenciaFestival() == referenciaFestival) {
                return f;
            }
        }
        return null;
    }
    
    public String procurarProgramacaoFestival(Festival festival) {
        for (ProgramacaoFestival f : lstProgramacaoFestival) {
            if (f.getFestival().equals(festival)) {
                return f.toString();
            }
        }
        return null;
    }
    
    public String getFestivaisAsString() {
        String festivaisString = "N.D.";
        for (Festival f : lstFestivais) {
            festivaisString += f.toString();
        }
        return festivaisString;
    }
    // Completar com outras funcionalidades

    public Festival procurarReferenciaFestivalProgramacao(int referencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Festival procurarFestivalDesign(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
    
