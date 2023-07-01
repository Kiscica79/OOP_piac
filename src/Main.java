import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> lines = FileReader.fileReadHandler("piac.txt");
        List<Termek> piac = new ArrayList<>();

        for (var line : lines) {
            String[] lineAsArray = line.split(";");
            String nev = lineAsArray[0];
            String egyseg = lineAsArray[1];
            int ar = Integer.parseInt(lineAsArray[2]);
            boolean hatosagiAr = Boolean.parseBoolean(lineAsArray[3]);
            String kategoria = lineAsArray[4];

            Termek actualPiac = new Termek(lineAsArray[0], lineAsArray[1],
                    Integer.parseInt(lineAsArray[2]), Boolean.parseBoolean(lineAsArray[3]),
                    lineAsArray[4]);
            piac.add(actualPiac);

        }
        for (var actualTermek : piac) {
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
        // TODO Mi a legdrágább, és a legolcsóbb?



    }
}
