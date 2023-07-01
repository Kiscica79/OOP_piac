// úgy is lehetne, hogy class helyett record, és akkor a Termék után vannak felsorolva a fieldek
public class Termek {
    private String nev;
    private String egyseg;
    private int ar;
    private boolean hatosagiAr;
    private Iz kategoria;

    public Termek(String nev, String egyseg, int ar, boolean hatosagiAr, Iz kategoria) {
        this.nev = nev;
        this.egyseg = egyseg;
        this.ar = ar;
        this.hatosagiAr = hatosagiAr;
        this.kategoria = kategoria;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getEgyseg() {
        return egyseg;
    }

    public void setEgyseg(String egyseg) {
        this.egyseg = egyseg;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public boolean isHatosagiAr() {
        return hatosagiAr;
    }

    public void setHatosagiAr(boolean hatosagiAr) {
        this.hatosagiAr = hatosagiAr;
    }

    public Iz getKategoria() {
        return kategoria;
    }

    public void setKategoria(Iz kategoria) {
        this.kategoria = kategoria;
    }

    @Override
    public String toString() {
        return "Termek{" +
                "nev='" + nev + '\'' +
                ", egyseg='" + egyseg + '\'' +
                ", ar=" + ar +
                ", hatosagiAr=" + hatosagiAr +
                ", kategoria=" + kategoria +
                '}';
    }
}
