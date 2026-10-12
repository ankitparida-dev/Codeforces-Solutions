import java.util.*;
public class Main{
       public static void main(String args[]){
              Scanner S=new Scanner(System.in);
              int n=S.nextInt();
              int m=S.nextInt();
              int width=0;
              for(int i=1;i<=n;i++){
                     int a=S.nextInt();
                     if(a>m){
                            width+=2;
                     }
                     else{
                            width+=1;
                     }
              }
              System.out.println(width);
       }
}