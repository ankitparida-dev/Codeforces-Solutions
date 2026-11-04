import java.util.*;
public class Main{
       public static void main(String[] args){
              Scanner S=new Scanner(System.in);
              int k=S.nextInt();
              int l=S.nextInt();
              int m=S.nextInt();
              int n=S.nextInt();
              int d=S.nextInt();
              int count=0;
              for(int i=1;i<=d;i++){
                     if(i%k==0 || i%l==0 || i%m==0 || i%n==0){
                            count++;
                     }
              }
              System.out.println(count);
       }
}