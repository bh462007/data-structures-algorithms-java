class LargeAfterFirst{
    static void bubble(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

        int last=arr[arr.length-1];
        System.out.println("Largest element after first pass: "+last);
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2};
        bubble(arr);
    }
}

/*
1st pass:
[3,1,2]
3 > 1 = 1,3,2
3 > 2 = 1,2,3

*/