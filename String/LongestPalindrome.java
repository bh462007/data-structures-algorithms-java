class LongestPalindrome{
    static boolean pal(String s, int low, int high){
        while(low<high){
            if(s.charAt(low)!=s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
    static String getLongestPal(String s){
        int n=s.length();
        int max=1;
        int start=0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if(pal(s,i,j) && (j-i+1)>max){
                    start=i;
                    max=j-i+1;
                }
            }
        }
        return s.substring(start, start+max);
    }
    public static void main(String[] args) {
        String s="forgeeksskeegfor";
        String res=getLongestPal(s);
        System.out.println("Result: "+res);
    }
}