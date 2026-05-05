import java.util.*;
public class jatin{
    public static void main(String[] args){
    Scanner sr=new Scanner (System.in);
    int n=sr.nextInt();
    int arr[]=new int[n];
    for(int i=0; i<n; i++){
    arr[i]=sr.nextInt();
    }
    for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+ " ");
    }
    }
}