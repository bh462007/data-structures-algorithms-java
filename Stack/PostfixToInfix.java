
import java.util.Stack;

class PostfixToInfix{
    static boolean isOperator(char ch){
        return ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^';
    }
    static String convert(String exp){
        Stack<String> stack=new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch=exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stack.push(ch+" ");
            }
            else if (isOperator(ch)) {
                String op2 = stack.pop();  
                String op1 = stack.pop();  

                String temp = "(" + op1 + ch + op2 + ")";
                stack.push(temp);
            }
        }
        return stack.peek();
    }
    public static void main(String[] args) {
        String exp = "ABC*+";
        System.out.println(convert(exp));
    }
}