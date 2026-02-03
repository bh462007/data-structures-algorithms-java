class RecursiveBubble{
    static void recursiveBubble(int[] arr, int n){
    
        if(n <= 1){
            return;
        }

        boolean flag=false;
        for (int j = 0; j < n-1; j++) {
            if(arr[j] > arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                flag=true;
            }
        }
        if(!flag){
            return;
        }
    
        recursiveBubble(arr, n-1);
    }
    public static void main(String[] args) {
        int[] arr={4,2,3,5,1};
        int n=arr.length;
        recursiveBubble(arr, n);

        for(int num : arr){
            System.out.print(" "+num);
        }

    }
}