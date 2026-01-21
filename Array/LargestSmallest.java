class LargestSmallest{
    public static void main(String[] args) {
        int[] arr={5, 1, 9, 9, 7};
        int max=arr[0];
        int min=arr[0];
        //int diff = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
            // else if(arr[i]<max && arr[i]>min){         //for finding Difference between max and min
            //     diff=arr[i];
            // }
        }
        System.out.println("Largest value:"+max);
        System.out.println("Smallest value:"+min);
        //System.out.println("Difference between max and min: "+diff);

    }
}