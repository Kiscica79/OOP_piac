public class Termek {
    private String nev;
    private String egyseg;
    private int ar;
    private boolean hatosagiAr;
    private String kategoria;

    public Termek(String nev, String egyseg, int ar, boolean hatosagiAr, String kategoria) {
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

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }
}
