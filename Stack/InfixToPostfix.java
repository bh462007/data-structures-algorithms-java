
import java.util.Stack;

class InfixToPostfix{
    static int precedence(char ch){
        if(ch=='^') return 3;
        if(ch=='*' || ch=='/') return 2;
        if(ch=='+' || ch=='-') return 1;
        return -1;
    }
    static String convert(String exp){
        Stack<Character> stack=new Stack<>();
        String result="";
        for (int i = 0; i < exp.length(); i++) {
            char ch=exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                result+=ch;
            }
            else if(ch=='('){
                stack.push(ch);
            }
            else if(ch==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    result+=stack.pop();
                }
                 stack.pop();
            }
            else{
                while(!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)){
                    result+=stack.pop();
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty() ){
            result+=stack.pop();
        }
        return result;

    }

    public static void main(String[] args) {
        
        String exp="A+B*C(D^B)";
        System.out.println(convert(exp));
    }
}