import java.util.*;
public class CountSubArray {
    public static int subArray(int arr[]){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum%2!=0)count++;

            }
        }
        return count;
       

    }
    public static void main(String[] args) {
        int arr[]={1,3,5};
        System.out.println(subArray(arr));
        
    }
    
}
