class Atoi{
    static int conversion(String s){
        
        int num=0;
        int sign=1;
        int i=0;

        if(s.charAt(0) == '-'){
            sign =-1;
            i=1;
        }

        for(; i<s.length();i++ ){
            char ch=s.charAt(i);

            if(ch < '0' || ch > '9'){
                System.out.println("Invalid character");
                break;
            }
            int digit=ch - '0';
            num=num*10+digit;
        }

        return num*sign;
    }
    public static void main(String[] args) {
        String s="-879";
        int result=conversion(s);
        System.out.println("Result: "+result);
    }
}






// Start with num = 0.

// Loop through each character in the string.

// Convert the character to its numeric value by subtracting '0'.

// Example: '3' - '0' → 3

// Multiply num by 10 and add the digit.

// Handle a negative sign if it exists at the start.