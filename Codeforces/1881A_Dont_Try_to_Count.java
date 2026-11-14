import java.util.*;
public class Main{
       public static void main(String[] args){
              Scanner S=new Scanner(System.in);
              int t=S.nextInt();
              while(t-->0){
                     int n=S.nextInt();
                     int m=S.nextInt();
                     String x=S.next();
                     String s=S.next();
                     int ans=-1;
                     for(int ops=0;ops<=5;ops++){
                            if(x.contains(s)){
                                   ans=ops;
                                   break;
                            }
                            x+=x;
                     }
                     System.out.println(ans);
              }
       }
}