import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            
            int maxDist = 0;
            int prev = 0;
            
            for (int i = 0; i < n; i++) {
                int curr = sc.nextInt();
                maxDist = Math.max(maxDist, curr - prev);
                prev = curr;
            }
            
            // Last gas station to x and back to the station
            maxDist = Math.max(maxDist, 2 * (x - prev));
            
            System.out.println(maxDist);
        }
        
        sc.close();
    }
}