class Reverse{
    // public static void main(String[] args) {
    //     int[] arr={1,2,3,4,5};
    //     for(int i=arr.length-1;i>=0;i--){
    //         System.out.println(arr[i]);
    //     }
    // }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};

        //reverse using without using extra array
        // int a=0;
        // int b=arr.length-1;
        // while(a<b){
        //     int temp=arr[a];
        //     arr[a]=arr[b];
        //     arr[b]=temp;
        //     a++;
        //     b--;
        // }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }


        //reverse using extra array
        int[] array= new int[arr.length];
        int j=0;
        for (int i = array.length-1; i >= 0; i--) {
            array[i]=arr[j];
            j++;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}