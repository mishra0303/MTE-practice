
import java.util.*;

public class ProductSubArray {
    public static ArrayList<Integer> product(int arr[]){
        ArrayList<Integer>ans=new ArrayList<>();
        int n=arr.length;
        int mul=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    mul=(mul*arr[j]);
                   
                }
                
            }
            
            
            ans.add(mul);
            mul=1;
            
        }
        
       
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={2,4,1,6};
        System.out.println(product(arr));
        
    }
    
}
