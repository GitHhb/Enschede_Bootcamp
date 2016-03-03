package klascode3;

import java.util.Scanner;

public class LeesInput {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Voer je naam in");
        String s = input.next();
        System.out.println("Voer je adres in");
        String t = input.next();
        System.out.println("Input 1: " + s);
        System.out.println("Input 2: " + t);

        for (int q = 0; q < 7; q++) {
            System.out.println("Input 1: " + s);
            System.out.println("Input 2: " + t);
        }

        int getal = 3;
        if (getal > 3) {
            System.out.println("Dit getal is groter dan 3");
        }
    }
}


