package Tree.BinarySearching;

public class Trapping {
    public static int trap(int heights[]){
        int n=heights.length;
       
       int  index=0;

        for( int i=0;i<n;i++){
            if(heights[i]>heights[index]){
                index=i;
            }

        }
        int water=0;
        int left=-1;
        for(int i=0;i<index;i++){
            if(heights[i]<left){
                water+=(left-heights[i]);
            }else{
                left=heights[i];
            }
        }
        int right=-1;
        for(int i=n-1;i>=index;i--){
            if(heights[i]<right){
                water+=(right-heights[i]);
            }else{
                right=heights[i];
            }
        }
        return water;
        
    }
    public static void main(String[] args) {
        int heights[]={3,0,1,0,4,0,2};
        System.out.println(trap(heights));
        
    }
}
