class CountVowels{
    public static void main(String[] args) {
        String s="chachi";
        s=s.toLowerCase();
        int countV=0;
        int countC=0;

        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                countV++;
            }
            else{
                countC++;
            }
        }
        System.out.println("Count of vowels: "+countV);
        System.out.println("Count of consonants: "+countC);
    }
}