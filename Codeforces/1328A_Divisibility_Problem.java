import java.util.*;
public class Main{
       public static void main(String[] args){
              Scanner S=new Scanner(System.in);
              int t=S.nextInt();
              while(t-->0){
                     int a=S.nextInt();
                     int b=S.nextInt();
                     if(a%b==0){
                            System.out.println(0);
                     }
                     else{
                            System.out.println(b-(a%b));
                     }
              }
       }
}