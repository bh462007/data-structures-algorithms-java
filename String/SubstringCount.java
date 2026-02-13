class SubstringCount{
    static int countSubstring(String s){
        int n=s.length();
        int count=0;
        for (int i = 0; i < n; i++) {
            
            if(s.charAt(i) == '1'){
                for (int j = i+1; j < n; j++) {
                    if(s.charAt(j) == '1'){
                        count++;
                    }
                }
            }
        }
        return count;

        // int count=0;
        // for (int i = 0; i < s.length(); i++) {
        //     char ch=s.charAt(i);
        //     if(ch == '1'){
        //         count++;
        //     }
        // }
        // return count*(count-1)/2;
    }
    public static void main(String[] args) {
        String s="00100101";
        int res=countSubstring(s);
        System.out.println("Count of possible substring starting and ending with 1: "+res);
    }
}