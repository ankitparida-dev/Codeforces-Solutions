import java.util.*;
public class Main{
       public static void main(String[] args){
              Scanner S=new Scanner(System.in);
              int k=S.nextInt();
              int n=S.nextInt();
              int w=S.nextInt();
              int totalCost=0;
              for(int i=1;i<=w;i++){
                     totalCost+=k*i;
              }
              if(totalCost>n){
                     System.out.println(totalCost-n);
              } else{
                     System.out.println(0);
              }
       }
}