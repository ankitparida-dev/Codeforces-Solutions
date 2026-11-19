import java.util.*;
public class Main{
       public static void main(String[] args){
              Scanner S=new Scanner(System.in);
              int t=S.nextInt();
              while(t-->0){
                     int n=S.nextInt();
                     int k=S.nextInt();
                     boolean found=false;
                     for(int i=0;i<n;i++){
                            if(S.nextInt()==k){
                                   found=true;
                            }
                     }
                     System.out.println(found?"YES":"NO");
              }
       }
}