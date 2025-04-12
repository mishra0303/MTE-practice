package TwodArrays;

public class MaximumRowSum {

    //Maximum rowSum
    public static int maximumRowSum(int arr[][],int rows,int cols){
        
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<rows;i++){
            int rowSum=0;
            for(int j=0;j<cols;j++){
                rowSum+=arr[i][j];

            }
            maxSum=Math.max(maxSum,rowSum);
        }
        return maxSum;
    }

    public static int maximumColSum(int arr[][],int rows,int cols){
        
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<rows;i++){
            int colSum=0;
            for(int j=0;j<cols;j++){
                colSum+=arr[j][i];

            }
            maxSum=Math.max(maxSum,colSum);
        }
        return maxSum;
    }


    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int m=arr.length;
        int n=arr.length;
        System.out.println("Maximum RowSum is: "+maximumRowSum(arr, m, n));
        System.out.println(" Maximum Column Sum: "+maximumColSum(arr, m, n));
        
    }
    
}
