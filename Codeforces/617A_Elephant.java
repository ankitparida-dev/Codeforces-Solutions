import java.util.*;
public class Main{
       public static void main(String[] args){
              Scanner S=new Scanner(System.in);
              int n=S.nextInt();
              int steps=n/5;
              if(n%5!=0){
                     steps++;
              }
              System.out.println(steps);
       }
}