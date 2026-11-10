import java.util.*;
public class Main{
       public static void main(String[] args){
              Scanner S=new Scanner(System.in);
              int t=S.nextInt();
              while(t-->0){
                     int n=S.nextInt();
                     String s=S.next();
                     int totalDots=0;
                     for(int i=0;i<n;i++){
                            if(s.charAt(i)=='.'){
                                   totalDots++;
                            }
                     }
                     if(s.contains("...")){
                            System.out.println(2);
                     }
                     else{
                         System.out.println(totalDots);   
                     }
              }
       }
}