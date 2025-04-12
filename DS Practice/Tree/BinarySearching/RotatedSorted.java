package Tree.BinarySearching;

public class RotatedSorted {
    public static boolean rotated(int arr[]){
        int n=arr.length;
        int peak=0;
        
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                peak++;
            }
           
        }
        if(arr[n-1]>arr[0]){
            peak++;
        }
        if(peak<=1){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3 };
        System.out.println(rotated(arr));
        
    }
}
