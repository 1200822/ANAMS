package model;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;



public class Festival {
    private int refFestival;
    private String dsgFestival;
    private ArrayList<Entidade> entColaboradoras;
    private String edicao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Recinto recinto;
    private List<Convite> lstConvites;
    
    private static int numeroFestival=0;
    
    private static final String STRING_POR_OMISSAO="";
    
    public Festival(){
        this.refFestival=numeroFestival++;
        this.dsgFestival=STRING_POR_OMISSAO;
        this.entColaboradoras = new ArrayList<>();
        this.edicao=STRING_POR_OMISSAO;
        this.dataInicio = LocalDate.now();
        this.dataFim = LocalDate.now();
        this.recinto=new Recinto();
        this.lstConvites = new ArrayList<>();
    }
    
    public Festival(String dsgFestival,String edicao,LocalDate dataInicio, LocalDate dataFim,Recinto recinto){
        this.refFestival=numeroFestival++;
        this.dsgFestival=dsgFestival;
        this.entColaboradoras = new ArrayList<>();
        this.edicao=edicao;
        this.dataInicio=dataInicio;
        this.dataFim=dataFim;
        this.recinto=new Recinto(recinto);
        this.lstConvites = new ArrayList<>();
    }
    
    public Festival(String dsgFestival,ArrayList<Entidade> entColaboradoras,String edicao,LocalDate dataInicio, LocalDate dataFim,Recinto recinto){
        this.refFestival=numeroFestival++;
        this.dsgFestival=dsgFestival;
        this.entColaboradoras = new ArrayList<> (entColaboradoras);
        this.edicao=edicao;
        this.dataInicio=dataInicio;
        this.dataFim=dataFim;
        this.recinto=new Recinto(recinto);
        this.lstConvites = new ArrayList<>();
    }
    
    public Festival(Festival f){
        this.refFestival=numeroFestival++;
        this.dsgFestival=f.dsgFestival;
        this.edicao=f.edicao;
        this.dataInicio=f.dataInicio;
        this.dataFim=f.dataFim;
        this.recinto=new Recinto(f.recinto);
        this.lstConvites = new ArrayList<Convite>(f.lstConvites);
    }
    
    public Convite novoConvite(){
        return new Convite();
    }

    public int getRefFestival() {
        return refFestival;
    }

    public String getDsgFestival() {
        return dsgFestival;
    }

    public ArrayList<Entidade> getEntColaboradoras() {
        return entColaboradoras;
    }

    public String getEdicao() {
        return edicao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }
    
    public LocalDate getDataFim(){
        return dataFim;
    }
    
    public Recinto getRecinto() {
        return recinto;
    }

    public List<Convite> getLstConvites() {
        return lstConvites;
    }
    

    public void setRefFestival(int refFestival) {
        this.refFestival = refFestival;
    }
    
    public void setDsgFestival(String dsgFestival) {
        this.dsgFestival = dsgFestival;
    }

    public void setEntColaboradoras(ArrayList<Entidade> entColaboradoras) {
        this.entColaboradoras = entColaboradoras;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }
    
    public void setDataFim(LocalDate dataFim){
        this.dataFim = dataFim;
    }

    public void setRecinto(Recinto recinto) {
        this.recinto = recinto;
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
    
    public Convite procurarConvite(int cod){
        for (Convite c: lstConvites) {
            if (c.getCod() == cod) {
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
        return this.refFestival == other.refFestival
                && this.dsgFestival.equalsIgnoreCase(other.dsgFestival)
                && this.entColaboradoras.equals(other.entColaboradoras)
                && this.edicao.equalsIgnoreCase(other.dsgFestival)
                && this.dataInicio.equals(other.dataInicio)
                && this.dataFim.equals(other.dataFim)
                && this.recinto.equals(other.recinto);
    }

    @Override
    public String toString() {
        return "Festival:" + "\n - Referência do Festival=" + refFestival 
                           + "\n - Designação do Festival:" + dsgFestival 
                           + "\n - Entidades Colaboradoras:" + entColaboradoras 
                           + "\n - Edição do Festival:" + edicao
                           + "\n - Data Início Festival:" + dataInicio 
                           + "\n - Data Fim do Festival:" + dataFim
                           + "\n - Recinto do Festival=" + recinto;
    }
}
