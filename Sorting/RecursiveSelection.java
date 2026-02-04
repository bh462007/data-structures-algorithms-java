class RecursiveSelection{
    static void recursiveSelection(int[] arr, int start){
        if(start >= arr.length-1){
            return;
        }

        int minIndex=start;
        for (int i = start+1; i < arr.length; i++) {
            if(arr[i] < arr[minIndex]){
                minIndex=i;
            }   
        }
        int temp=arr[start];
        arr[start]=arr[minIndex];
        arr[minIndex]=temp;

        recursiveSelection(arr, start+1);

    }
    public static void main(String[] args) {
        int[] arr={4,2,3,1,5};
        recursiveSelection(arr, 0);

        for(int num : arr){
            System.out.println(num);
        }
    }
}