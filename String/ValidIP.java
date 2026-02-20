class ValidIP{
    static boolean isValidIP(String s){
        if(s==null || s.length()==0){
            return false;
        }
        String[] parts=s.split("\\.");

        if(parts.length != 4){
            return false;
        }

        for(String part:parts){
            if(part.length()==0){
                return false;
            }
            if(part.length()>1 && part.charAt(0) == '0'){
                return false;
            }
            for (int i = 0; i < part.length(); i++) {
                char ch=part.charAt(i);
                if(ch < '0'|| ch > '9'){
                    return false;
                }
            }
            
            int num=0;
            for (int i = 0; i < part.length(); i++) {
                num=num*10+(part.charAt(i)-'0');
            }

            if(num<0 || num>255){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String s="172.16.254.1";
        boolean result=isValidIP(s);
        if(result){
            System.out.println("It is a valid IP");
        }
        else{
            System.out.println("It is not a valid IP");
        }
    }
}






// FUNCTION isValidIP(s)

//     IF s is null OR empty
//         RETURN false

//     parts = split s by "."

//     IF length of parts != 4
//         RETURN false

//     FOR each part in parts

//         IF part is empty
//             RETURN false

//         IF length > 1 AND first char == '0'
//             RETURN false

//         FOR each character in part
//             IF character not digit
//                 RETURN false

//         num = 0
//         FOR each character in part
//             num = num * 10 + (character - '0')

//         IF num < 0 OR num > 255
//             RETURN false

//     RETURN true