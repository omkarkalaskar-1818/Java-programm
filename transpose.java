
import java.util.Scanner;

 class transpose{

    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int trans[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix element :" + a.length);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                trans[i][j] = a[j][i];
            }
        }
        System.out.println("The orignal matrix is given:=");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The transpose matrix is");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }

}
