package Tree.BinarySearching;

public class Anagram {
    public static boolean Isanagram(String s,String t){

        if(s.length()!=t.length())return false;
        char[]freq1=new char[26];
        char[]freq2=new char[26];
        for(int i=0;i<s.length();i++){
            freq1[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            freq2[t.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i])return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";
        System.out.println(Isanagram(s,t));
        
    }
    
}
