import java.util.*;

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
           Termek actualtermek =  piac.add(new Termek(
                    lineAsArray[0],
                    lineAsArray[1],
                    Integer.parseInt(lineAsArray[2]),
                    Boolean.parseBoolean(lineAsArray[3]),
                    lineAsArray[4].equals("sós") ? Iz.SOS : Iz.EDES,
                    lineAsArray.length > 5 ? List.of(lineAsArray[5]) : new ArrayList<>()
            // iz simán a fenti equals helyett
            ));
        }

        for (Termek actualTermek : piac) {
            System.out.println(actualTermek);
        }

        // TODO hány db hatósági áras termék van?
        int count = 0;
        for (var actualTermek : piac) {
            if (actualTermek.isHatosagiAr()) {
                count++;
            }
        }
        System.out.println(count);

        // TODO Mekkora a sós és édes sütemények aránya?
        int countSos = 0;
        for (var actualTermek : piac) {
            if (actualTermek.kategoria().equals(Iz.SOS)) {
                countSos++;
            }
        }
        System.out.println(countSos);


        // TODO Mi a legdrágább, és a legolcsóbb?
        Termek legdragabb = piac.get(0);
        Termek legolcsobb = piac.get(0);
        for (Termek actualTermek : piac) {
            if (actualTermek.ar() > legdragabb.ar()) {
                legdragabb = actualTermek;
            }
            if (actualTermek.ar() < legolcsobb.ar()) {
                legolcsobb = actualTermek;
            }
            System.out.println("Ez a termék a legdrágább: " + legdragabb.nev() + " aminek az ára: " +
                    legdragabb.ar());
            System.out.println("Ez a termék a legolcsóbb:" + legolcsobb.nev() + "aminek az ára: " +
                    legolcsobb.nev());


            // TODO Melyik termék kapható a legtöbb helyen?
            //  Van olyan hely, ahol több termék is elérhető?

            Map<String, Integer> countPlaces = new HashMap<>();
            for (var actual : piac) {
                List<String> placesOfPurchase = actual.placesOfPurchase();
                for (String place : placesOfPurchase) {
                    countPlaces.put(place, countPlaces.getOrDefault(place, 0) + 1);
                }
            }

            int maxItem = 0;
            String mostPlace = "";
            for (Map.Entry<String, Integer> entry : countPlaces.entrySet()) {
                if (entry.getValue() > maxItem) {
                    maxItem = entry.getValue();
                    mostPlace = entry.getKey();

                }
            }
            System.out.println("Legtöbb helyen kapható termék száma: " + maxItem);
            System.out.println("Az elérhető legtöbb hely: " + mostPlace);
        }
    }
}

