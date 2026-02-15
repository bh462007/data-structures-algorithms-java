class AddBinary{
    static String addBinary(String s1, String s2){
        int i=s1.length()-1;
        int j=s2.length()-1;
        int carry=0;

        StringBuilder sb=new StringBuilder();

        while(i >= 0 || j >= 0 || carry != 0){
            int sum=carry;

            if(i>=0){
                sum+=s1.charAt(i--) - '0';
            }
            if(j>=0){
                sum+=s2.charAt(j--) - '0';
            }
            sb.append(sum % 2);
            carry= sum / 2;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String s1 = "111";
        String s2 = "111";
        String res=addBinary(s1,s2);
        System.out.println("Addition of binary: "+res);

    }
}