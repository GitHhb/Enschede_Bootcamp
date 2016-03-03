package galgje;

import java.util.Scanner;

/**
 * Created by L on 3/2/2016.
 */
public class Main {
    public static void main(String[] args) {
        // selecteer te raden woord
        WoordenVerzameling wv =  new WoordenVerzameling();
        String woord = wv.kiesWoord();

        // start nieuw galgje spel
        Galgje galgje = new Galgje(woord);

        // lees
        Scanner sc = new Scanner(System.in);
        String letter;

        while (true) {
            System.out.println("Geef een letter:");
            letter = sc.next();
            if (galgje.raadWoord(letter)) {
                // woord geraden of geen beurten meer
                break;
            }
        }
    }

}

// Het Galgje spel
class Galgje {
    final String teRadenWoord;      // te raden woord
    String geradenWoord;            // geraden letters zichtbaar, niet geraden letters gelijk aan "*"
    String geradenLetters = "";     // alle geraden letters tot nu toe
    final int maxPogingen = 9;      // max aantal toegstane pogingen
    int restPogingen = maxPogingen; // resterend aantal pogingen

    Galgje (String s) {
        teRadenWoord = s;
        geradenWoord = teRadenWoord.replaceAll(".", "*");
    }

    // print het woord met de letters die geraden zijn zichtbaar
    String printGeradenLetters () {
        return geradenLetters;
    }

    // raad een nieuwe letter
    boolean raadWoord(String c) {
        // onthou deze letter
        geradenLetters += c;
        // check of de letter reeds geprobeerd is
        if (geradenWoord.contains(c)) {
            System.out.println("Deze letter is eerder ingegeven.");
            // decrease resterende pogingen
            restPogingen--;
        }

        // check of de letter in het woord zit
        if (! teRadenWoord.contains(c)) {
            System.out.println("Letter komt niet voor");
            // decrease resterende pogingen
            restPogingen--;
        }
        else {
            // bereken tot nu toe geraden woord
            geradenWoord = teRadenWoord.replaceAll("[^" + geradenLetters + "]", "*");
        }

        //System.out.println(teRadenWoord);
        System.out.println(geradenWoord);

        // check of het hele woord geraden is
        if (geradenWoord.equals(teRadenWoord)) {
            System.out.println("Woord is geraden!");
            return true;
        } else if (restPogingen == 0) {
            System.out.println("Geen resterende pogingen meer.");
            return true; // woord is geraden
        }

        // print resterende pogingen
        System.out.println("Resterend aantal pogingen: " + restPogingen);
        return false;
    }



}

class WoordenVerzameling {
    String woordenarr[] = {
            "veelbetekenend",
            "tentoonstelling",
            "organisatietalent",
            "programmeerervaring"
    };

    String kiesWoord() {
        // genereer random nummer als index naar woordenarr
        int i = (int)(Math.random() * woordenarr.length);
        // return random woord
        return woordenarr[i];
    }
}
