import java.util.*;
public class Main{
       public static void main(String[] args){
              Scanner S=new Scanner(System.in);
              int t=S.nextInt();
              while(t-->0){
                     int n=S.nextInt();
                     int sum=0;
                     for(int i=0;i<n-1;i++){
                            sum+=S.nextInt();
                     }
                     System.out.println(-sum);
              }
       }
}