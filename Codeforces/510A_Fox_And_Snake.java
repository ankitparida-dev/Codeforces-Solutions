import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int m = sc.nextInt();
 
        for (int i = 0; i < n; i++) {
 
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    System.out.print("#");
                }
            } 
            else {
                for (int j = 0; j < m; j++) {
 
                    if (i % 4 == 1 && j == m - 1) {
                        System.out.print("#");
                    } 
                    else if (i % 4 == 3 && j == 0) {
                        System.out.print("#");
                    } 
                    else {
                        System.out.print(".");
                    }
                }
            }
 
            System.out.println();
        }
 
        sc.close();
    }
}