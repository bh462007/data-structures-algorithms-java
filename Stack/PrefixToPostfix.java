
import java.util.Stack;

class PrefixToPostfix{
    static boolean isOperator(char ch){
        return ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='^';
    }
    static String convert(String exp){
        Stack<String> stack=new Stack<>();
        for(int i=exp.length()-1;i>=0;i--){
            char ch=exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stack.push(ch+"");
            }
            else if(isOperator(ch)){
                String s1=stack.pop();
                String s2=stack.pop();

                String temp= s1 + s2 + ch ;
                stack.push(temp);
            }
        }
        return stack.peek();
    }
    public static void main(String[] args) {
        String exp = "+A*BC";
        System.out.println(convert(exp));
    }
}




⚙️ Rules
1. If operand → push
    A → push "A"
2. If operator:
    Pop 2 elements
    Make:
        op1 op2 operator
    Push back