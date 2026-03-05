import java.util.Arrays;

class Anagram{
    static boolean isAnagrams(String s1, String s2){

        if(s1.length() != s2.length()){
            return false;
        }

        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String sorted1=new String(arr1);
        String sorted2=new String(arr2);
        
        return sorted1.equals(sorted2);


        // int[] count = new int[26];
        
        // for (int i = 0; i < s1.length(); i++) {
        //     count[s1.charAt(i) - 'a']++;
        //     count[s2.charAt(i) - 'a']--;
        // }
        
        // for (int num : count) {
        //     if (num != 0) {
        //         return false;
        //     }
        // }
        
        // return true;
    }
    public static void main(String[] args) {
        String s1="retro";
        String s2="torer";
        boolean res=isAnagrams(s1,s2);
        System.out.println("Is anagrams: "+res);
    }
}