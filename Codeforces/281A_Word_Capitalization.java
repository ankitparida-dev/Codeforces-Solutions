import java.util.*;
public class Main{
       public static void main(String[] args){
              Scanner S=new Scanner(System.in);
              String str=S.next();
              char arr[]=str.toCharArray();
              for(int i=0;i<arr.length;i++){
                     arr[0]=Character.toUpperCase(arr[0]);
              }
              String str2=new String(arr);
              System.out.println(str2);
       }
}