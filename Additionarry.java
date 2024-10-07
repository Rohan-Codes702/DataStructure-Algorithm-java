import java.util.Scanner;
public class Additionarry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        System.out.println("Enter the the array of 1st matrx");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(a[i][j] + " ");
            }
            System.out.println("\n");
        }
        System.out.println("Enter element of 2 nd matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(b[i][j] +"");
            }
            System.out.println("\n");
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                c[i][j] = a[i][j] + b[i][j];
                System.out.printf(c[i][j]+"");
            }
            System.out.println("\n");
        }
    }
}