
class Stack {
    int maxSize;
    int[] stack;
    int[] inc;
    int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[maxSize];
        inc = new int[maxSize];
        top = -1;
    }

    public void push(int x) {
        if (top < maxSize - 1) {
            stack[++top] = x;
        }
    }

    public int pop() {
        if (top == -1) return -1;

        int res = stack[top] + inc[top];

        if (top > 0) {
            inc[top - 1] += inc[top];
        }

        inc[top] = 0;
        top--;

        return res;
    }

    public void increment(int k, int val) {
        int i = Math.min(k, top + 1) - 1;
        if (i >= 0) {
            inc[i] += val;
        }
    }
}

public class CustomStack {
    public static void main(String[] args) {
        Stack st = new Stack(5);

        st.push(5);
        st.push(3);
        st.push(7);

        System.out.println(st.pop());

        st.increment(2, 10);

        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}