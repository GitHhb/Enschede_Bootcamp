package opdracht._8_check_wachtwoord;

import java.util.Scanner;

public class CheckWachtwoord {
    public static void main(String[] args) {
        String wachtwoord = "java";
        Scanner sc = new Scanner(System.in);
        String input;

        input = sc.nextLine();
        if (wachtwoord.equals(input))
            System.out.println("Wachtwoord is OK: " + input);
        else
            System.out.println("Wachtwoord is fout: " + input);
    }
}
