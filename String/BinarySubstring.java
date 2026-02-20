class BinarySubstring{
    static int countBinarySubstring(String s){

        int pre=0;
        int cur=1;
        int result=0;

        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)){
                cur++;
            }
            else{
                result+=Math.min(pre, cur);
                pre=cur;
                cur=1;
            }
        }
        result+=Math.min(pre, cur);
        return result;
    }
    public static void main(String[] args) {
        String s="00110011";
        int res=countBinarySubstring(s);
        System.out.println("Count of binary substrings: "+res);
    }
}