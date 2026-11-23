import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();
            
            int ans = -1;
            for (int ops = 0; ops <= 5; ops++) {
                if (x.contains(s)) {
                    ans = ops;
                    break;
                }
                x += x;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}