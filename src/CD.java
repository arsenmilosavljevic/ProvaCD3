public class CD {
    private String titolo;
    private String autore;
    private int brani;
    private int durata;

    public CD(){

    }
    public CD(String titolo, String autore, int brani, int durata){
        setTitolo(titolo);
        setAutore(autore);
        setBrani(brani);
        setDurata(durata);
    }

    public CD(CD cd){
        this(cd.titolo, cd.autore, cd.brani, cd.durata);
    }

    public String getTitolo(){
        return titolo;
    }
    public void setTitolo(String titolo){
        this.titolo=titolo;
    }
    public String getAutore(){
        return autore;
    }
    public void setAutore(String autore){
        this.autore=autore;
    }
    public int getBrani(){
        return brani;
    }
    public void setBrani(int brani){
        this.brani=brani;
    }
    public int getDurata(){
        return durata;
    }
    public void setDurata(int durata){
        this.durata=durata;
    }

    public String toString(){
        return "Il CD si intitola "+titolo+" e stato pubblicao da "+autore+" contiene "+brani+" brani e dura "+durata;
    }

    public int compareDurata(CD cd){
        int tempo=0;
        if(this.getDurata() == cd.getDurata()){
            tempo=this.getDurata();
        }else if(this.getDurata() > cd.getDurata()){
            tempo=this.getDurata();
        }else{
            tempo=cd.getDurata();
        }
        return tempo;
    }

    public boolean equals(CD cd){
        boolean uguale=false;
        if (titolo.equals(cd.titolo) && autore.equals(cd.autore) && brani==cd.brani && durata==cd.durata){
            uguale = true;
        }
        return uguale;
    }
}
