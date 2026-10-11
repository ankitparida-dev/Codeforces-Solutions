import java.util.*;
public class Main{
       public static void main(String args[]){
              Scanner S=new Scanner(System.in);
              int a=S.nextInt();
              int b=S.nextInt();
              int years=0;
              while(a<=b){
                     a=a*3;
                     b=b*2;
                     years++;
              }
              System.out.println(years);
       
       }
}