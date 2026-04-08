class QueueUsingStack{
    int[] s1,s2;
    int top1,top2;
    int size;

    public QueueUsingStack(int size) {
        this.s1 = new int[size];
        this.s2 = new int[size];
        this.top1 = -1;
        this.top2 = -1;
        this.size = size;
    }
    
    public void push1(int x){
        if(top1==size-1){
            System.out.println("Stack1 overflow");
            return;
        }
        top1++;
        s1[top1]=x;
    }

    public void push2(int x){
        if(top2==size-1){
            System.out.println("Stack2 overflow");
            return;
        }
        top2++;
        s2[top2]=x;
    }

    public int pop1(){
        if(top1==-1){
            System.out.println("Queue underflow");
            return -1;
        }
        int popped1=s1[top1];
        top1--;
        return popped1;
    }

    public int pop2(){
        if(top2==-1){
            System.out.println("Queue underflow");
            return -1;
        }
        int popped2=s2[top2];
        top2--;
        return popped2;
    }
    public void enqueue(int x){
        push1(x);
    }

    public int dequeue(){
        if(top1==-1 && top2==-1){
            System.out.println("Empty queue");
            return -1;
        }
        if(top2==-1){
            while(top1!=-1){
                push2(pop1());
            }
        }
        return pop2();
    }

    public boolean isEmpty(){
        return top1==-1 && top2==-1;
    }

    public int peek(){
        if(top1==-1 && top2==-1){
            System.out.println("Empty queue");
            return -1;
        }
        if(top2==-1){
            while(top1!=-1){
                push2(pop1());
            }
        }
        return s2[top2];
    }

    public static void main(String[] args) {
        QueueUsingStack obj=new QueueUsingStack(5);
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);

        System.out.println(obj.peek());
        obj.dequeue();
        System.out.println(obj.peek());
    }
}