
import java.util.*;

class NumberOfRecentCalls {

    Queue<Integer> queue;

    public NumberOfRecentCalls() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {

        queue.add(t);

        while (!queue.isEmpty() && queue.peek() < t - 3000) {
            queue.poll();
        }

        return queue.size();
    }
       

    public static void main(String[] args) {
        NumberOfRecentCalls rc = new NumberOfRecentCalls();

        System.out.println(rc.ping(1));     // 1
        System.out.println(rc.ping(100));   // 2
        System.out.println(rc.ping(3001));  // 3
        System.out.println(rc.ping(3002));  // 3
    }
}

