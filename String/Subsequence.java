class Subsequence{
    // static boolean  isSubsequence(String s1, String s2, int m, int n){
    //     if(m==0){
    //         return true;
    //     }
    //     if(n==0){
    //         return false;
    //     }
    //     if(s1.charAt(m-1) == s2.charAt(n-1)){
    //         return  isSubsequence(s1, s2, m-1, n-1);
    //     }
    //     return isSubsequence(s1, s2, m, n-1);
    // }
    
    static boolean isSubsequence(String s1, String s2){
        int m=s1.length();
        int n=s2.length();
        
        int i=0, j=0;
        while(i < m && j < n){
            if(s1.charAt(i) == s2.charAt(j))
                i++;
            j++;
        }
        return i == m;
    }

    public static void main(String[] args) {
    
        String s1="gksrek";
        String s2="geeksforgeeks";

        int m=s1.length();
        int n=s2.length();
        boolean res=isSubsequence(s1,s2);
        if(res){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}