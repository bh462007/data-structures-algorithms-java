import java.util.Stack;

class MinAddParentheses{
    static int minAddToMakeValid(String s){
        Stack<Character> stack=new Stack<>();
        int addition=0;

        for(char ch:s.toCharArray()){
            if(ch=='('){
                stack.push(ch);
            }
            else{
                if(!stack.isEmpty()){
                    stack.pop();
                }
                else{
                    addition++;
                }
            }
        }
        return addition+stack.size();

    }
    public static void main(String[] args) {
        String s = "())(";
        System.out.println(minAddToMakeValid(s)); 
    }
}