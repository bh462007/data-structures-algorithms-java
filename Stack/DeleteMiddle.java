
import java.util.Stack;

class DeleteMiddle{
    static void deleteMiddle(Stack<Integer> stack, int k){
        //if middle reached then pop
        if(k==0){
            stack.pop();
            return;
        }
        //pop the top element
        int temp=stack.pop();

        deleteMiddle(stack, k-1);

        stack.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        int k=stack.size()/2;

        deleteMiddle(stack, k);

        System.out.println(stack);

    }
}