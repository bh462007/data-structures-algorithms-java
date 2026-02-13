class CheckBinary{
    static boolean checkBinary(String s1){
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) == '0' || s1.charAt(i) == '1'){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1="abc01010";
        String s2="abcd";
        boolean res=checkBinary(s1);
        System.out.println("Does "+s1+" contains binary data: "+res);

        boolean result=checkBinary(s2);
        System.out.println("Does "+s2+" contains binary data: "+result);
    }
}