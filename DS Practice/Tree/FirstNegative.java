package Tree;
import java.util.*;

public class FirstNegative {
    public static List<Integer> firstNegative(int arr[],int k){
        List<Integer>ans=new ArrayList<>();
        int n=arr.length;
        
        for(int i=0;i<n-k+1;i++){
            int negative=Integer.MAX_VALUE;
            for(int j=i;j<=k-1+i;j++){
               if(arr[j]<0&&negative==0){
                negative=arr[j];
                break;
               }
               
             
             
            }
            if(negative==Integer.MAX_VALUE){
                ans.add(0);
               }else{
                ans.add(negative);
               }
             
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={-10, 20, 30, -40, -50, 60};
        System.out.println(firstNegative(arr, 2));
         
        
    }
}
