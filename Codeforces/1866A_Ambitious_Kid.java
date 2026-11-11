import java.util.*;
public class Main{
       public static void main(String[] args){
              Scanner S=new Scanner(System.in);
              int n=S.nextInt();
              int minops=Integer.MAX_VALUE;
              for(int i=0;i<n;i++){
                     int val=S.nextInt();
                     minops=Math.min(minops,Math.abs(val));
              }
              System.out.println(minops);
       }
}