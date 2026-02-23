class RomanInteger{
    static int value(char ch){
        if(ch =='I') return 1;
        if(ch =='V') return 5;
        if(ch =='X') return 10;
        if(ch =='L') return 50;
        if(ch =='C') return 100;
        if(ch =='D') return 500;
        if(ch =='M') return 1000;
        return 0;
    }
    static int convert(String s){

        int res=0;
        for (int i = 0; i < s.length(); i++) {
            int s1=value(s.charAt(i));

            if((i+1)<s.length()){
                int s2=value(s.charAt(i+1));

                if(s1>=s2){
                    res+=s1;
                }
                else{
                    res+=(s2-s1);
                    i++;
                }
            }
            else{
                res+=s1;
            }
        }

        return res;

    }
    public static void main(String[] args) {
        String s="IX";
        System.out.println(convert(s));
    }
}




// For every character:

// If next value is bigger → subtract

// Otherwise → add