class CountFrequency{
    public static void main(String[] args) {
        int[] arr={2,3,2,5,3};
        int max=5;

        int[] freq= new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        System.out.println("Frequency: ");
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]>0){
                System.out.println(i+" occurs "+freq[i]+" times");
            }
        }

        // System.out.println("Occurred once:");
        // for (int i = 0; i < arr.length; i++) {
        //     if(freq[arr[i]]==1){
        //         System.out.println(arr[i]);
        //         break;
        //     }
        // }

    }
}