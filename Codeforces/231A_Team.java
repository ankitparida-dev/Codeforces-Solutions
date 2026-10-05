import java.util.*;
public class Main{
       public static void main(String args[]){
              Scanner S=new Scanner(System.in);
              int n=S.nextInt();
              int count=0;
              for(int i=0;i<n;i++){
                     int a=S.nextInt();
                     int b=S.nextInt();
                     int c=S.nextInt();
                     if(a+b+c>=2){
                            count++;
                     }
              }
              System.out.println(count);
       }
}