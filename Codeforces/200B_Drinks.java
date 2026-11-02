import java.util.*;
public class Main{
       public static void main(String[] args){
              Scanner S=new Scanner(System.in);
              int n=S.nextInt();
              double ans=0;
              for(int i=0;i<n;i++){
                     int x=S.nextInt();
                     ans+=x;
              }
              System.out.println(ans/n);
       }
}