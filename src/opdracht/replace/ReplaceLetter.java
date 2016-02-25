package opdracht.replace;

public class ReplaceLetter {
    public static void main(String[] args) {
        String org = "Deze regel heeft best wel veel eees.";
        String res;

        // Vervang elke letter "e" in org door een "*"
        res = "";
        for (char c: org.toCharArray()) {
            res += (c != 'e') ? c : '*';
        }

        // Print string res
        System.out.println(res);
    }
}
