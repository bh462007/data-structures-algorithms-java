class Bubble{
    static void ascending(int[] arr){
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int nums : arr){
            System.out.println(nums);
        }
    }
    public static void main(String[] args) {
        int[] arr={6,5,7,2,3,4,1};
        ascending(arr);
    }
}


// int[] arr = {1, 2, 3, 4, 5};
//         int n = arr.length;

//         for (int i = 0; i < n - 1; i++) {
//             boolean swapped = false;

//             for (int j = 0; j < n - 1 - i; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                     swapped = true;
//                 }
//             }

//             if (!swapped) {
//                 break; // array already sorted
//             }
//         }

//         for (int num : arr) {
//             System.out.print(num + " ");
//         }