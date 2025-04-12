package TwodArrays;
import java.util.*;

public class Implementation {
    public static int []dArrays(int arr[][],int key){
        int m=arr.length;
        int n=arr.length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                
                if(arr[i][j]==key)return new int[]{i,j};
            }
            
        }
        return new int[]{-1,-1};

    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(dArrays(arr,12)));
        
    }
    
}
