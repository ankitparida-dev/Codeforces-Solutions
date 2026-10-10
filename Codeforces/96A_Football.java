import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
 
        String str = S.next();
 
        int count = 1;
 
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                count = 1;
            }
 
            if (count >= 7) {
                System.out.println("YES");
                return;
            }
        }
 
        System.out.println("NO");
    }
}
 