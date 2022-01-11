package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Convite.Estado;
import utilitarios.Data;
import utilitarios.DataHora;


public class Festival {
    private int referenciaFestival;
    private String designacaoFestival;
    private ArrayList<Entidade> entidadeColaboradora;
    private String edicaoFestival;
    private LocalDate dataInicioFestival;
    private LocalDate dataFimFestival;
    private Recinto recintoFestival;
    private List<Convite> lstConvites;
    
    private static int nroFestival=0;
    
    private static final String STRING_POR_OMISSAO="";
    
    public Festival(){
        this.referenciaFestival=nroFestival++;
        this.designacaoFestival=STRING_POR_OMISSAO;
        this.entidadeColaboradora = new ArrayList<>();
        this.edicaoFestival=STRING_POR_OMISSAO;
        this.dataInicioFestival = LocalDate.now();
        this.dataFimFestival = LocalDate.now();
        this.recintoFestival=new Recinto();
        this.lstConvites = new ArrayList<>();
    }
    
    public Festival(String designacao,String edicao,LocalDate dataInicioFestival, LocalDate dataFimFestival,Recinto recinto){
        this.referenciaFestival=nroFestival++;
        this.designacaoFestival=designacao;
        this.entidadeColaboradora = new ArrayList<>();
        this.edicaoFestival=edicao;
        this.dataInicioFestival=dataInicioFestival;
        this.dataFimFestival=dataFimFestival;
        this.recintoFestival=new Recinto(recinto);
        this.lstConvites = new ArrayList<>();
    }
    
    public Festival(String designacao,ArrayList<Entidade> entidadeColaboradora,String edicao,LocalDate dataInicioFestival, LocalDate dataFimFestival,Recinto recinto){
        this.referenciaFestival=nroFestival++;
        this.designacaoFestival=designacao;
        this.entidadeColaboradora = new ArrayList<> (entidadeColaboradora);
        this.edicaoFestival=edicao;
        this.dataInicioFestival=dataInicioFestival;
        this.dataFimFestival=dataFimFestival;
        this.recintoFestival=new Recinto(recinto);
        this.lstConvites = new ArrayList<>();
    }
    
    public Festival(Festival festival){
        this.referenciaFestival=nroFestival++;
        this.designacaoFestival=festival.designacaoFestival;
        this.edicaoFestival=festival.edicaoFestival;
        this.dataInicioFestival=festival.dataInicioFestival;
        this.dataFimFestival=festival.dataFimFestival;
        this.recintoFestival=new Recinto(festival.recintoFestival);
        this.lstConvites = new ArrayList<Convite>(festival.lstConvites);
    }
    
    public Convite novoConvite(){
        return new Convite();
    }

    public int getReferenciaFestival() {
        return referenciaFestival;
    }

    public String getDesignacaoFestival() {
        return designacaoFestival;
    }

    public ArrayList<Entidade> getEntidadeColaboradora() {
        return entidadeColaboradora;
    }

    public String getEdicaoFestival() {
        return edicaoFestival;
    }

    public LocalDate getDataInicioFestival() {
        return dataInicioFestival;
    }
    
    public LocalDate getDataFimFestival(){
        return dataFimFestival;
    }
    
    public Recinto getRecintoFestival() {
        return recintoFestival;
    }

    public List<Convite> getLstConvites() {
        return lstConvites;
    }
    

    public void setReferenciaFestival(int referenciaFestival) {
        this.referenciaFestival = referenciaFestival;
    }
    
    public void setDesignacaoFestival(String designacaoFestival) {
        this.designacaoFestival = designacaoFestival;
    }

    public void setEntidadeColaboradora(ArrayList<Entidade> entidadeColaboradora) {
        this.entidadeColaboradora = entidadeColaboradora;
    }

    public void setEdicaoFestival(String edicaoFestival) {
        this.edicaoFestival = edicaoFestival;
    }

    public void setDataInicioFestival(LocalDate dataInicioFestival) {
        this.dataInicioFestival = dataInicioFestival;
    }
    
    public void setDataFimFestival(LocalDate dataFimFestival){
        this.dataFimFestival = dataFimFestival;
    }

    public void setRecintoFestival(Recinto recintoFestival) {
        this.recintoFestival = recintoFestival;
    }

    public void setLstConvites(List<Convite> lstConvites) {
        this.lstConvites = lstConvites;
    }
    
    public boolean adicionaConvite(Convite convite){
        return lstConvites.add(convite);
    }
    
    public boolean valida(){
        return true;
    }
    
    public boolean valida(Convite convite)
    {
        boolean bRet = false;
        if (convite.valida())
        {
           // Escrever aqui o código de validação
        
           //
           bRet = true; 
        }
        return bRet;
    }
    
    public String getListaConvitesAsString(){
        for (Convite c: lstConvites) {
            return c.toString();
        }
        return null;
    }
    
    public boolean registaConvite(Convite convite)
    {
        if (this.valida(convite))
        {
           return adicionaConvite(convite);
        }
        return false;
    }
    
    public Convite procurarConvite(int codigo){
        for (Convite c: lstConvites) {
            if (c.getCodigo() == codigo) {
                return c;
            }
        }
        return null;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Festival other = (Festival) obj;
        return this.referenciaFestival == other.referenciaFestival
                && this.designacaoFestival.equalsIgnoreCase(other.designacaoFestival)
                && this.entidadeColaboradora.equals(other.entidadeColaboradora)
                && this.edicaoFestival.equalsIgnoreCase(other.designacaoFestival)
                && this.dataInicioFestival.equals(other.dataInicioFestival)
                && this.recintoFestival.equals(other.recintoFestival);
    }

    @Override
    public String toString() {
        return "Festival{" + "referenciaFestival=" + referenciaFestival + ", designacaoFestival=" + designacaoFestival + ", entidadeColaboradora=" + entidadeColaboradora + ", edicaoFestival=" + edicaoFestival + ", dataInicioFestival=" + dataInicioFestival + ", recintoFestival=" + recintoFestival + '}';
    }
}
