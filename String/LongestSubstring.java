
import java.util.HashSet;

class LongestSubstring {
    public static  int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int j=0;
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(s.charAt(i));
            maxlen=Math.max(maxlen,i-j+1);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        String s="abababcccabcdef";
        int res=lengthOfLongestSubstring(s);
        System.out.println(res);
    }
}