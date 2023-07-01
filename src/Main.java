import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> lines = FileReader.fileReadHandler("piac.txt");
        List<Termek> piac = new ArrayList<>();

        for (String line : lines) {
            String[] lineAsArray = line.split(";");

            // ha többféle lenne, akkor a példányosítás előtt switch-csel adom hozzá
            /*
            Iz iz;
            switch (lineAsArray[4]) {
                case "sós" -> iz  = Iz.SOS;
                case "édes" -> iz = Iz.EDES;
            }
             */
            Termek actualPiac = new Termek(lineAsArray[0], lineAsArray[1],
                    Integer.parseInt(lineAsArray[2]), Boolean.parseBoolean(lineAsArray[3]),
                    "sós".equals(lineAsArray[4]) ? Iz.SOS : Iz.EDES);
                    // iz simán a fenti equals helyett

            piac.add(actualPiac);

        }
        for (Termek actualTermek : piac) {
            System.out.println(actualTermek);
        }

        // TODO hány db hatósági áras termék van?
        for (var actualTermek : piac) {
            if (actualTermek.isHatosagiAr()) {
                System.out.println(actualTermek);
            }
        }
        // TODO Mekkora a sós és édes sütemények aránya?
        for (var actualTermek : piac) {
            if (actualTermek.getKategoria().equals("sós")) {
                System.out.println(actualTermek);
            }
        }
        /*
        // TODO Mi a legdrágább, és a legolcsóbb?
        for (var actualTermek : piac) {
            int legdragabb = actualTermek[0];
            if (actualTermek.getAr() > legdragabb) {
                    legdragabb = actualTermek.getAr();
            }
            System.out.println(actualTermek);
        }

         */


    }
}
