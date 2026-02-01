class CheckSorted{
    static void bubble(int[] arr){
        int n=arr.length;

        for (int i = 0; i < n-1; i++) {

            if(arr[i] > arr[i+1]){
                    System.out.println("Not sorted");
                    return;
                }
            
        }
        
    }
    public static void main(String[] args) {
        int[] arr={246,67,78,89};
        bubble(arr);
    }
}

/*
Traverse once

If you find any inversion → not sorted
*/