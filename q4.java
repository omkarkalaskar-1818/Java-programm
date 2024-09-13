
public class q4 {

    public static void main(String[] args) {
        String str = "Hello world";  // You can change this string to test with other values

        System.out.println("Alternate characters:");

        // Loop through the string and print alternate characters
        for (int i = 0; i < str.length(); i += 2) {
            System.out.print(str.charAt(i) + " ");
        }
    }
}
