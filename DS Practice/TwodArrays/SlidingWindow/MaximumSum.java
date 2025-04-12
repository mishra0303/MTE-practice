package SlidingWindow;

public class MaximumSum {
    public static int maximumSum(int arr[],int k){
        int  n=arr.length;
        int l=0,r=k-1;
        int sum=0;
        if(n<k)return -1;
      
            
       
       
        for(int i=l;i<=r;i++){
            sum+=arr[i];
        }
        

       int maxSum=sum;
            
          
            
            while(r<n-1){
                sum=sum-arr[l];
                l++;
                r++;
                sum=sum+arr[r];
                maxSum=Math.max(maxSum,sum);
                
                
            }
        
        return maxSum ;
    }
    public static void main(String[] args) {
        int arr[]={100, 200, 300, 400};
        System.out.println(maximumSum(arr, 2));
        
    }
    
}
