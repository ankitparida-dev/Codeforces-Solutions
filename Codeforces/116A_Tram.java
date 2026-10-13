import java.util.*;
public class Main{
       public static void main(String[] args){
              Scanner S=new Scanner(System.in);
              int n=S.nextInt();
              int current=0;
              int maxCapacity=0;
              for(int i=0;i<n;i++){
                     int a=S.nextInt();
                     int b=S.nextInt();
                     current=current-a+b;
                     maxCapacity=Math.max(maxCapacity,current);
              }
              System.out.println(maxCapacity);
       }
}