package SlidingWindow;

public class LongestSubArray {
    //brute force Approach
    // public static int longestSubArray(int arr[],int k){
    //     int n=arr.length;
    //     int maxLen=Integer.MIN_VALUE;
    //     for(int i=0;i<n;i++){
    //         int sum=0;
    //         for(int j=i;j<n;j++){
    //             sum+=arr[j];
    //             if(sum<=k){
    //                 maxLen=Math.max(maxLen,j-i+1);

    //             }else if(sum>k)break;

    //         }
    //     }
    //     return maxLen;
    // }
    public static int longestSubArray(int arr[],int k){
        int l=0,r=0;
        int n=arr.length;
        int sum=0,maxLen=Integer.MIN_VALUE;
        while(r<n){
            sum+=arr[r];
            if(sum>k&&l<=r){
                sum=sum-arr[l];
                l++;
            }else if(sum<=k){
                maxLen=Math.max(maxLen,r-l+1);
                r++;
            }

        }
        return maxLen;
    }
    public static void main(String[] args) {
        int arr[]={2,5,1,7,10};
        System.out.println(longestSubArray(arr, 14));

    }
    
}
