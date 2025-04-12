package Tree.BinarySearching;

import java.util.Arrays;

public class FirstAndLastOccurrence {
    public static int firstOccurrence(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        int first=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                first=mid;
                end=mid-1;
            }
           else if(arr[mid]<target)start=mid+1;
           else{
            end=mid-1;
           }
           
        }
        return first;

    }

    public static int lastOccurrence(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        int last=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                last=mid;
                start=mid+1;
            }
           else if(arr[mid]<target)start=mid+1;
           else{
            end=mid-1;
           }
           
        }
        return last;

    }
     static int[] countFreq(int arr[],int target){
        int first=firstOccurrence(arr, 2);
        int last=lastOccurrence(arr, 2);
       
        return new int[]{first,last};
    }
    
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,2,3};
        int target=2;
        
       int[] result = countFreq(arr, target); 
        System.out.println("First and Last Occurrence: " + Arrays.toString(result));
        
        

        
    }
}
