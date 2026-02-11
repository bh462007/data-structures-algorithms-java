class OuterMostParanthesis{
    static String outerMost(String s){
        String res="";
        int counter=0;

        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch == '('){
                counter++;
                if(counter > 1){
                    res=res+'(';
                }
            }
            else{
                counter--;
                if(counter > 0){
                    res=res+')';
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s="()(()())(())";
        String res=outerMost(s);
        System.out.println("result: "+res);
        
    }
}