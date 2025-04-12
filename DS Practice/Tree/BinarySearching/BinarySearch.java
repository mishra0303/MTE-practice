package Tree.BinarySearching;

public class BinarySearch {
    public static int  binarySearch(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                System.out.println("got the element");
            return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={3,7,11,12,17,18,23,27,29};
       System.out.println(binarySearch(arr,27));
       
        
    }
    
}
