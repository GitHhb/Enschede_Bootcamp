package opdracht._2_letter_count;

public class LetterCount {
    public static void main(String[] args) {
        String org = "Deze regel heeft best wel veel eees.";
        int res;

        // Tel hoe vaak de letter "e" voorkomt in string org
        res = 0;
        for (int i = 0; i < org.length(); i++) {
            if (org.charAt(i) == 'e')
                res++;
        }

        // Print aantal "e"-s in org
        System.out.println(res);
    }
}
