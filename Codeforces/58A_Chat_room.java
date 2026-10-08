import java.util.*;
public class Main{
       public static void main(String[] args){
              Scanner S=new Scanner(System.in);
              String str=S.next();
              String target="hello";
              int j=0;
              for(int i=0;i<str.length();i++){
                     if(j<target.length() && str.charAt(i)==target.charAt(j)){
                            j++;
                     }
              }
              if(j==target.length()){
                     System.out.println("YES");
              }
              else{
                     System.out.println("NO");
              }
       }
}