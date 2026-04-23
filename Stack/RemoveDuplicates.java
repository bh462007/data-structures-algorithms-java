import java.util.*;

class RemoveDuplicates {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop(); // remove duplicate
            } else {
                stack.push(ch);
            }
        }

        // build result
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }
    public static void main(String[] args) {
        RemoveDuplicates obj=new RemoveDuplicates();
        String s="abbaca";
        System.out.println(obj.removeDuplicates(s));

    }
}