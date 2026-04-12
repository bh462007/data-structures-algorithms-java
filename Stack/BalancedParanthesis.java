
import java.util.Stack;

class BalancedParanthesis{
    public boolean isValid(String s){
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) return false;
                char top=st.pop();
                if((ch==')'&&ch=='(') || (ch=='}'&&ch=='{') || (ch==']'&&ch=='[')){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        BalancedParanthesis obj=new BalancedParanthesis();
         String s = "()[{}()]";

        if (obj.isValid(s))
            System.out.println("True");
        else
            System.out.println("False");

    }
}