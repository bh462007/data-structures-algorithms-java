
import java.util.Stack;

class MinStack{
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x){
        stack.push(x);

        if(minStack.isEmpty() || x <= minStack.peek()){
            minStack.push(x);
        }
    }

    public void pop(){
        if(stack.isEmpty()) return;

        int removed=stack.pop();

        if(removed==minStack.peek()){
            minStack.pop();
        }
    }

    public int top(){
        if(stack.isEmpty()) return -1;
        return stack.peek();
    }

    public int getMin(){
        if(minStack.isEmpty()) return -1;
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack obj=new MinStack();

        // obj.push(5);
        // obj.push(3);
        // obj.push(7);
        // obj.push(3);

        obj.push(2);
        obj.push(2);
        obj.push(1);

        System.out.println(obj.getMin());

        obj.pop();
        System.out.println(obj.getMin());

        obj.pop();
        System.out.println(obj.getMin());
    }
    
    
}