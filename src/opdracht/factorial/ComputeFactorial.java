package opdracht.factorial;

public class ComputeFactorial {
    public static void main(String[] args) {
        int number = 9;
        int fact;

        // compute factorial of number and assign result to fact
        // assume number >= 1
        fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }

        // print fact
        System.out.println(fact);
    }
}
