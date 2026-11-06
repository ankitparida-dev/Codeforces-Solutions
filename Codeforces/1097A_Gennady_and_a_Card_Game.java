import java.util.*;
public class Main{
       public static void main(String args[]){
              Scanner S=new Scanner(System.in);
              String hand=S.next();
              boolean found=false;
              for(int i=0;i<5;i++){
                     String card=S.next();
                     if(hand.charAt(0)==card.charAt(0) || hand.charAt(1)==card.charAt(1)){
                            found=true;
                     }
              }
              if(found){
                     System.out.println("YES");
              }
              else{
                     System.out.println("NO");
              }
       }
}