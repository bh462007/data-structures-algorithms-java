class Insertion{
    static void insertion(int[] arr){
        int n=arr.length;

        for (int i = 1; i < n; i++) {
            int key=arr[i];
            int j=i-1;

            //if we are still in the array and the element in greater than key then
            //shift the element to right
            //do not place the element at the index yet
            while(j >= 0 && arr[j] > key){
                arr[j+1]=arr[j];
                j--;
            }

            //after shifting we put the element at the index 
            arr[j+1]=key;
        }
        for(int num : arr){
            System.out.println(num);
        }
    }
    public static void main(String[] args) {
        int[] arr={8, 3, 5, 2};
        insertion(arr);
    }
}