

class FirstNonRepeating{
    // static char firstNonRepeating(String s){
    //     int n=s.length();
    //     for (int i = 0; i < n; i++) {
    //         boolean found=false;
    //         for (int j = 0; j < n; j++) {
    //             if(i!=j && s.charAt(i) == s.charAt(j)){
    //                 found=true;
    //             }
    //         }
    //         if(!found){
    //             return s.charAt(i);
    //         }
    //     }
    //     return '$';
    // }



    static final int max_char=26;
    static  char firstNonRepeating(String s){
        int[] freq=new int[max_char];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (char ch : s.toCharArray()) {
            if(freq[ch - 'a'] == 1){
                return ch;
            }
        }
        return '$';
    }

    public static void main(String[] args) {
        String s="masami";
        System.out.println("First non repeating char: "+firstNonRepeating(s));
    }
}