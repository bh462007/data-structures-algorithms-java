
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class ReverseFirstK{
    static void reverse(Queue<Integer> queue, int k){
        if(queue.isEmpty()|| k<=0 || k>queue.size()){
            return;
        }
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
        int remaining=queue.size()-k;
        for (int i = 0; i < remaining; i++) {
            queue.add(queue.poll());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue =new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        int k = 3;

        reverse(queue, k);

        System.out.println(queue);
        
    }
}