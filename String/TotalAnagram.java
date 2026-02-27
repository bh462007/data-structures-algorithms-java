

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TotalAnagram{
    static boolean isAnagram(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }

        char[] arr1=a.toCharArray();
        char[] arr2=b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
    static int  countTotalPairs(String s){
        int n=s.length();
        List<String> substring=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int l = 1; l <= n-i; l++) {
                substring.add(s.substring(i, i+l));
            }
        }

        int count=0;
        for (int i = 0; i < substring.size(); i++) {
            for (int j = i+1; j < substring.size(); j++) {
                if( isAnagram(substring.get(i), substring.get(j) )){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s="abba";
        int res=countTotalPairs(s);
        System.out.println("Result: "+res);
    }
}