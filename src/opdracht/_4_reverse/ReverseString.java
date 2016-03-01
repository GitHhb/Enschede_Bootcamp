package opdracht._4_reverse;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Ik programmeer Java!";
        String reverse;
        System.out.println(str);

        // _4_reverse = omgekeerde van str
        reverse = new StringBuffer(str).reverse().toString();

        // print _4_reverse
        System.out.println(reverse);
    }
}
