class Lexicographical{
    static String nextString(String s){
        int n=s.length()-1;
        while(n>=0&&s.charAt(n)=='z'){
            n--;
        }
        if(n==-1){
            return s+'a';
        }
        char[] arr=new char[n];
        arr[n]++;
        return new String(arr,0,n+1);
    }
    public static void main(String[] args) {
        String s="zzz";
        System.out.println(nextString(s));
    }
}