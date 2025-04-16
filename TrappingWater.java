public class TrappingWater {
    public static int trapping(int arr[]){
        int n=arr.length;
        int maxIndex=0;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[maxIndex]){
                maxIndex=i;
            }
            

        }
        int left=-1, water1=0;
        for(int i=0;i<maxIndex;i++){
            if(arr[i]<left){
                water1+=left-arr[i];
            }else{
                left=arr[i];
            }

        }
        int right=-1,water=0;
        for(int i=n-1;i>=maxIndex;i--){
            if(arr[i]<right){
                water+=(right-arr[i]);
            }else{
                right=arr[i];
            }

        }
       int result=Math.max(water1,water);
       return result;
       
    }
    public static void main(String[] args) {
        int arr[]={3,0,1,0,4,0,2};
        System.out.println(trapping(arr));

    }
    
}
