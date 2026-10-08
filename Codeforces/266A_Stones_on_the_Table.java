import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
 
        int n = S.nextInt(); // read 3
        String str = S.next(); // read RRG
 
        int count = 0;
 
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            }
        }
 
        System.out.println(count);
    }
}