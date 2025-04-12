package TwodArrays;

public class SearchingIn2d {
    public static boolean searchRow(int matrix[][],int target,int row){
        int n=matrix[0].length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==matrix[row][mid])return true;
            else if(target>matrix[row][mid])start=mid+1;
            else{
                end=mid-1;
            }
        }
        return false;
    }
    public static boolean searching(int matrix[][],int target){
        int m=matrix.length;
        int n=matrix[0].length;
            int start=0;
            int end=m-1;
            while(start<=end){
            
            int midRow=start+(end-start)/2;
            if(target>=matrix[midRow][0]&&target<=matrix[midRow][n-1])return searchRow(matrix,target,midRow);
            else if(target>matrix[midRow][n-1]){
                start=midRow+1;

            }else{
                end=midRow-1;
            }


        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,3}};
        System.out.println(searching(matrix, 3));
        
    }
    
}
