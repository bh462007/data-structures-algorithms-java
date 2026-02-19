class KNonRepeating{
    static char kNonRepeating(String s,int k){
        int count=0;
        char result='\0';

        for (int i = 0; i < s.length(); i++) {
            boolean flag=false;

            for (int j = 0; j < s.length(); j++) {
                
                if(i!=j && s.charAt(i) == s.charAt(j)){
                    flag=true;
                    break;
                }
            }

            if(!flag){
                count++;

                if(count==k){
                    result=s.charAt(i);
                    return result;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String s="Bhagyashri";
        int k=3;

        char result=kNonRepeating(s,k);

        if(result=='\0'){
            System.out.println("There is no kth non repeating character exists");
        }
        else{
            System.out.println("Kth non repeating character is "+result);
        }
    }
}