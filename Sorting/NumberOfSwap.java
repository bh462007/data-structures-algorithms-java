class NumberOfSwap{
    static void bubble(int[] arr){
        int n=arr.length;
        int count=0;

        for (int i = 0; i < n-1; i++) {
            boolean flag=false;

            for (int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                    count++;
                }
            }
            if(!flag){
                break;
            }
        }
        
        System.out.println("Count of swaps: "+count);
    }
    public static void main(String[] args) {
        int[] arr={2,6,4,3,1,5};
        bubble(arr);
    }
}