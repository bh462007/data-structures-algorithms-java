

class StackUsingQueue{
    int currSize, maxSize;
    int queue[];
    int start, end;

    public StackUsingQueue( int maxSize) {
        this.currSize = 0;
        this.maxSize = maxSize;
        this.queue = new int[maxSize];
        this.start = -1;
        this.end = -1;
    }
    
    public void push(int x){
        if(currSize==maxSize){
            System.out.println("Queue is full");
            return;
        }
        if(end==-1){
            start=0;
            end=0;
        }
        else{
            end=(end+1)%maxSize;
        }
        queue[end]=x;
        currSize++;

        int temp;
        for(int i=0;i<currSize-1;i++){
            temp=queue[start];
            start=(start+1)%maxSize;

            end=(end+1)%maxSize;
            queue[end]=temp;
        }
    }

    public int pop(){
        if(start==-1){
            System.out.println("Queue is empty");
            System.exit(1);
        }
        int popped=queue[start];
        if(currSize==1){
            start=-1;
            end=-1;
        }
        else{
            start=(start+1)%maxSize;
        }
        currSize--;
        return popped;
    }

    public int peek(){
        if(start==-1){
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[start];
    }
    public boolean isEmpty(){
        return currSize==0;
    }

    public static void main(String[] args) {
        StackUsingQueue s=new StackUsingQueue(6);

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