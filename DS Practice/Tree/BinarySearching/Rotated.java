package Tree.BinarySearching;

import java.util.*;
public class Rotated {
    public static int[] rotated(int arr[],int k){
        int n=arr.length;
        
       while(k>0){
        int i=0;
        int temp=arr[n-1];
        for( i=n-2;i>=0;i--){
            arr[i+1]=arr[i];
        }
        arr[0]=temp;
        k--;
       }
       return arr;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(rotated(arr, 3)));
    }
    
}