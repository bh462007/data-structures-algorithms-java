class Isomorphic{
    static boolean areIsomorphic(String s1,String s2){
        int n=s1.length();

        for (int i = 0; i < n; i++) {
            char ch1=s1.charAt(i);
            char ch2=s2.charAt(i);

            for (int j = 0; j < n; j++) {
                if(s1.charAt(j)==ch1 && s2.charAt(j)!=ch2){
                    return false;
                }
                if(s2.charAt(j)==ch2 && s1.charAt(j)!=ch1){
                    return false;
                }
            }
        }


        return true;
    }
    public static void main(String[] args) {
        String s1="aab";
        String s2="xxz";
        if(areIsomorphic(s1,s2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}