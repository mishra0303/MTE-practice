package Tree.BinarySearching;
import java.util.*;

public class HashmapImplementation {
    public static void frequency(String s){
       
        HashMap<Character,Integer>mp=new HashMap<>();
        for(char  el:s.toCharArray()){
            if(!mp.containsKey(el)){
                mp.put(el, 1);
            }else{
                mp.put(el,mp.get(el)+1);
            }

        }
        System.out.println(mp.entrySet());
        int maxFreq=0;
        char ansKey = '\0'; 
        for(Map.Entry<Character,Integer>ele:mp.entrySet()){
            if(ele.getValue()>maxFreq){
                maxFreq=ele.getValue();
                ansKey=ele.getKey();
            }
            
        }
        System.out.println(ansKey);
    }
    public static void main(String[] args) {
       String s="Hello";
        frequency(s);
        
        
    }
}
