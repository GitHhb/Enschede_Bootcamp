package opdracht.reverse;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Ik programmeer Java!";
        String reverse;

        // reverse = omgekeerde van str
        reverse = new StringBuffer(str).reverse().toString();

        // print reverse
        System.out.println(reverse);
    }
}
