
import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {
       System.out.println("enter a string :");
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        String vowels = "aeiou";
        for (int i = 0; i < str.length(); i++) {
            char o = Character.toLowerCase(str.charAt(i));
            if (vowels.indexOf(o) != -1) {
                System.out.println(o + " ");
            }
        }

    }

}
