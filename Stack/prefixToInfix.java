
import java.util.Stack;

class PrefixToInfix{
    public static boolean isOperator(char ch){
        return ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='^';
    }
    static String convert(String exp){
        Stack<String> s=new Stack<>();

        for (int i = exp.length()-1; i >= 0; i--) {
            char ch=exp.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                s.push(ch+"");
            }
            else if(isOperator(ch)){
                String s1=s.pop();
                String s2=s.pop();

                String temp="("+ s1 + ch + s2 +")";
                s.push(temp);
            }
        }
        return s.peek();
    }

    public static void main(String[] args) {
        
        String exp="+A*BC";
        System.out.println(convert(exp));
    }
}


/*
⚙️ Rules
1. If operand → push to stack
    A → push "A"
2. If operator (+, -, *, /, ^):
    Pop 2 elements
    Make:
     (op1 operator op2)
    Push back
*/