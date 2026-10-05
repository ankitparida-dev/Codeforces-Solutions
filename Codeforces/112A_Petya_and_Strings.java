import java.util.*;
public class Main{
       public static void main(String[] args){
              Scanner S=new Scanner(System.in);
              String s1=S.nextLine();
              String s2=S.nextLine();
              s1=s1.toLowerCase();
              s2=s2.toLowerCase();
              int res=s1.compareTo(s2);
              if(res<0){
                     System.out.println("-1");
              }
              else if(res==0){
                     System.out.println("0");
              }
              else if(res>0){
                     System.out.println("1");
              }
       }
}