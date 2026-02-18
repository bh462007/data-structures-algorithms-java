class RotationsString{
    // static boolean isRotationOfEachOther(String s1,String s2){

    //     if(s1.length() != s2.length()) return false;

    //     int n=s1.length();
    //     for (int i = 0; i < n; i++) {
    //         if(s1.equals(s2)){
    //             return true;
    //         }

    //         char last=s1.charAt(s1.length()-1);
    //         s1=last+s1.substring(0, s1.length()-1);
    //     }

    //     return false;
    // }



    static boolean isRotationOfEachOther(String s1, String s2) {

        if(s1.length() != s2.length()) return false;
        String combine=s1+s2;
        return combine.contains(s2);
    }


    public static void main(String[] args) {
        String s1="aab";
        String s2="aba";
        boolean res=isRotationOfEachOther(s1,s2);
        System.out.println("Is strings are rotation of each other: "+res);
    }
}

/*

first, check if both string gave same length
second, generate a temp String and concatenate both
third, check whether temp contains s2
        if yes then return true
        otherwise return false

*/