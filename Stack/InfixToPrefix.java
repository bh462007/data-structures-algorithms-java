import java.util.Stack;

class InfixToPrefix {

    static int precedence(char ch) {
        if (ch == '^') return 3;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '+' || ch == '-') return 1;
        return -1;
    }

    static String reverse(String exp) {
        StringBuilder sb = new StringBuilder(exp);
        sb.reverse();

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '(')
                sb.setCharAt(i, ')');
            else if (sb.charAt(i) == ')')
                sb.setCharAt(i, '(');
        }
        return sb.toString();
    }

    static String infixToPrefix(String exp) {
        Stack<Character> stack = new Stack<>();
        String result = "";

        exp = reverse(exp);

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                result += ch;
            }
            else if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.pop();
                }
                if (!stack.isEmpty()) stack.pop();
            }
            else {
                while (!stack.isEmpty() &&
                       precedence(stack.peek()) > precedence(ch)) {
                    result += stack.pop();
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return new StringBuilder(result).reverse().toString();
    }

    public static void main(String[] args) {
        String exp = "A+B*C";
        System.out.println(infixToPrefix(exp));
    }
}




/*
Trick to Convert Infix → Prefix

👉 You don’t write a completely new algorithm

Instead use this 3-step trick:

✅ Steps:
1.Reverse the infix expression
2.Swap brackets
    ( ↔ )
3.Convert to postfix (use your existing function)
4.Reverse the result
*/