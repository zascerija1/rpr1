package ba.unsa.etf.rpr;

public class Predmet {

    private String nazivPredmeta;
    private int sifraPredmeta;
    private int velicina;
    final int maxBrojStudenata;
    private Student [] niz;
    public Predmet(String nazivPredmeta, int sifraPredmeta, int maxBrojStudenata){
        this.nazivPredmeta=nazivPredmeta;
        this.velicina=0;
        this.sifraPredmeta=sifraPredmeta;
        this.maxBrojStudenata=maxBrojStudenata;
        niz= new Student[maxBrojStudenata];

    }
    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getSifraPredmeta() {
        return sifraPredmeta;
    }

    public void setSifraPredmeta(int sifraPredmeta) {
        this.sifraPredmeta = sifraPredmeta;
    }

public Predmet dodajStudenta(Student s){
        if(velicina>=maxBrojStudenata) throw new RuntimeException("Popunjen kapacitet");
        else {
            niz[velicina++]=s;

        }
return this;

}
public Predmet izbrisiStudenta(Student s){

        for(int i=0;i<velicina;i++){
            if(s.equals(niz[i])){
                for(int j=i;j<velicina;j++){
                    niz[j]=niz[j+1];
                }
                i=velicina;
                velicina--;
            }
        }
return this;

}
public void ispisi(){
        for(int i=0;i<velicina;i++){
            System.out.println(i+1+". "+ niz[i]);
        }
}

}
