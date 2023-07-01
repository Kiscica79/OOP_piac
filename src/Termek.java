import java.util.List;

// úgy is lehetne, hogy class helyett record, és akkor a Termék után vannak felsorolva a fieldek
public record Termek(String nev, String egyseg, int ar, boolean hatosagiar, Iz kategoria,
                     List<String> placesOfPurchase) {


    @Override
    public String toString() {
        return "Termek{" +
                "nev='" + nev + '\'' +
                ", egyseg='" + egyseg + '\'' +
                ", ar=" + ar +
                ", hatosagiar=" + hatosagiar +
                ", kategoria=" + kategoria +
                ", placesOfPurchase=" + placesOfPurchase +
                '}';
    }

    public boolean isHatosagiAr() {
        return true;
    }

}
