

class ImplementStack{
    int[] stack;
    int top;
    int size;

    public ImplementStack(int size) {
        this.stack = new int[size];
        this.top = -1;
        this.size = size;
    }

    public boolean isEmpty(){
        return top==-1;
    }

    public void push(int x){
        if(top==size-1){
            System.out.println("Stack overflow");
            return;
        }
        top++;
        stack[top]=x;
    }

    public int pop(){
        if(top==-1){
            System.out.println("Stack underflow");
            return -1;
        }
        int y=stack[top];
        top--;
        return y;
    }

    public int peek(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    public static void main(String[] args) {
        ImplementStack s=new ImplementStack(5);
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.peek()); // 30
        System.out.println(s.pop());  // 30
        System.out.println(s.peek()); // 20

        System.out.println(s.isEmpty());
        System.out.println(s.peek());
    }
}