class Selection{
    static void selection(int[] arr){
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            int minElement = i;

            for (int j = i+1; j < n; j++) {
                if(arr[j] < arr[minElement]){
                    minElement = j;
                }
            }

            int temp=arr[i];
            arr[i]=arr[minElement];
            arr[minElement]=temp;
        }
        for(int num : arr){
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        int[] arr={5,3,1,2,4};
        selection(arr);
    }
}

/*
“If I found a smaller element, why not swap immediately?

--Because we don’t yet know whether the current smaller element is the smallest overall.

If we swap early:

    We might swap again and again
    That becomes Bubble Sort

->Selection Sort’s rule is:

    Search first. Swap once.

*/