import java.util.*;
public class Main{
       public static void main(String[] args){
             Scanner S=new Scanner(System.in);
             int n=S.nextInt();
             boolean hard=false;
             for(int i=0;i<n;i++){
                    int opinion=S.nextInt();
                    if(opinion==1){
                           hard=true;
                    }
             }
             if(hard){
                    System.out.println("HARD");
             }
             else{
                    System.out.println("EASY");
             }
             
       }
}