class RecursiveInsertion{
    static void recursiveInsertion(int[] arr, int n){
        if(n<=1){
            return;
        }
        recursiveInsertion(arr, n-1);

        int key=arr[n-1];
        int j=n-2;

        while( j >= 0 && arr[j] > key){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
    }
    public static void main(String[] args) {
        int[] arr={4,2,3,5,1};
        recursiveInsertion(arr, arr.length);

        for(int num : arr){
            System.out.println(num);
        }
    }
}