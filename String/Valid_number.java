class Valid_number {
    public static boolean isNumber(String s) {
        boolean digit=false;
        boolean dot=false;
        boolean exp=false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                digit=true;
            }
            else if(ch=='.'){
                if(dot||exp) return false;
                dot=true;
            }
            else if(ch=='e'||ch=='E'){
                if(exp||!digit) return false;
                exp=true;
                digit=false;
            }
            else if(ch=='+'||ch=='-'){
                if(i!=0&&s.charAt(i-1)!='e'&&s.charAt(i-1)!='E'){
                    return false;
                }
            }
            else return false;
        }
        return digit;
    }
    public static void main(String[] args) {
        String s1="2";
        System.out.println(isNumber(s1));
        String s2="0.4";
        System.out.println(isNumber(s2));
        String s3="-23E23";
        System.out.println(isNumber(s3));
        String s4="1a";
        System.out.println(isNumber(s4));
        String s5="ab";
        System.out.println(isNumber(s5));
        
    }
}