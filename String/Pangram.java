class Pangram{
    static boolean isPangram(String s){
        if(s.length() < 26){
            return false;
        }
        s=s.toLowerCase();

        boolean[] flag= new boolean[26];
        
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                flag[ch - 'a']=true;
            }
        }
        for (int i = 0; i < 26; i++) {
            if(!flag[i]){
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s="The quick brown fox jumps over the lazy dog";
        boolean res=isPangram(s);
        System.out.println("Result: "+res);
    }
}






// 1. If length < 26 → return false
// 2. Convert string to lowercase
// 3. Create boolean[26]
// 4. Traverse string
// 5. If character is between 'a' and 'z'
//        mark visited[ch - 'a'] = true
// 6. After loop check:
//        if any visited[i] == false → return false
// 7. Else return true
