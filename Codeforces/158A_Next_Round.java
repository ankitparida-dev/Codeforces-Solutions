import java.util.*;
public class Main{
       public static void main(String args[]){
              Scanner S=new Scanner(System.in);
              int n=S.nextInt();
              int k=S.nextInt();
              int arr[]=new int[n];
              for(int i=0;i<arr.length;i++){
                     arr[i]=S.nextInt();
              }
              int count=0;
              for(int i=0;i<arr.length;i++){
                     
                     if(arr[i]>=arr[k-1] && arr[i]>0){
                            count++;
                     }
              }
              System.out.println(count);
       }
}