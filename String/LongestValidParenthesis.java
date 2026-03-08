
import java.util.Stack;

class LongestValidParenthesis{
    static int maxLength(String s){
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        int max=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                stack.push(i);
            }
            else{
                stack.pop();

                if(stack.isEmpty()){
                    stack.push(i);
                }
                else{
                    max=Math.max(max, i-stack.peek());
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String s="()()(";
        int result=maxLength(s);
        System.out.println("Longest valid parenthesis: "+result);
    }
}