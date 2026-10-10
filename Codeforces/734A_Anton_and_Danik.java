import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
 
        int n = S.nextInt();
        String str = S.next();
 
        HashMap<Character, Integer> map = new HashMap<>();
 
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
 
        int freq1 = map.getOrDefault('A', 0);
        int freq2 = map.getOrDefault('D', 0);
 
        if (freq1 > freq2) {
            System.out.println("Anton");
        } else if (freq1 < freq2) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
 
        S.close();
    }
}