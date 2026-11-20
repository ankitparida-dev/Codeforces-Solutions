import java.util.*;
public class Main{
       public static void main(String[] args){
              Scanner S=new Scanner(System.in);
              int t=S.nextInt();
              while(t-->0){
                     long a=S.nextLong();
                     long b=S.nextLong();
                     long c=S.nextLong();
                     if(c%2!=0){
                            a+=1;
                     }
                     System.out.println(a>b?"First":"Second");
              }
       }
}