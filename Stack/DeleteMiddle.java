
import java.util.Stack;

class DeleteMiddle{
    //recursive way
    // static void deleteMiddle(Stack<Integer> stack, int k){
    //     //if middle reached then pop
    //     if(k==0){
    //         stack.pop();
    //         return;
    //     }
    //     //pop the top element
    //     int temp=stack.pop();

    //     //call recursively
    //     deleteMiddle(stack, k-1);

    //      //push back elements
    //     stack.push(temp);
    // }

    // public static void main(String[] args) {
    //     Stack<Integer> stack=new Stack();
    //     stack.push(1);
    //     stack.push(2);
    //     stack.push(3);
    //     stack.push(4);
    //     stack.push(5);

    //     int k=stack.size()/2;

    //     deleteMiddle(stack, k);

    //     System.out.println(stack);

    // }







    //iterative way

    static void deleteMiddle(Stack<Integer> stack){
        int n=stack.size();
        if(n==0) return;

        int k=n/2;

        Stack<Integer> temp=new Stack<>();

        //moving element into temp stack until k
        for (int i = 0; i < k; i++) {
            temp.push(stack.pop());
        }

        //pop middle
        stack.pop();

        //push back remaining element
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        deleteMiddle(stack);

        System.out.println(stack);
    }
}