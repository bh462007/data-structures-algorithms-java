

class EarliestRepeating{
    static String firstRepeatingChar(String s){

        // for (int i = 0; i < s.length(); i++) {
        //     for (int j = 0; j < i; j++) {
        //         if(s.charAt(i) == s.charAt(j)){
        //             return Character.toString(s.charAt(i));
        //         }
        //     }
        // }
        // return "-1";



        int[] counter=new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);

            int index=ch -'a';

            if(counter[index] != 0){
                return Character.toString(ch);
            }

            counter[index]++;
        }

        return "-1";
    }
    public static void main(String[] args) {
        String s="namaste";
        String res=firstRepeatingChar(s);
        System.out.println("First earliest repeating character: "+res);
    }

    
}