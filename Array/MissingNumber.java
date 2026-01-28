class MissingNumber{
    public static void main(String[] args) {
        int[] arr={1, 2, 4, 5};
        int n=5;

        int[] freq=new int[n+1];

        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        for (int i = 1; i <= n; i++) {
            if(freq[i]==0){
                System.out.println(i+" is the missing number");
                break;
            }
        }


        
        // int expected=n*(n+1)/2;
        // int actual=0;

        // for (int i = 0; i < arr.length; i++) {
        //     actual+=arr[i];
        // }

        // int missing=expected - actual;
        // System.out.println("Missing element: "+missing);



        //using xor
        // int[] arr={1,2,4,5};

        // int n=arr.length;
        // int expected=n+1;
        // int xor1=0;
        // for (int i = 1; i <= expected; i++) {
        //     xor1^=i;
        // }
        // System.out.println("Expected: "+xor1);

        // int xor2=0;
        // for (int arr1 : arr) {
        //     xor2^=arr1;
        // }
        // System.out.println("Actual: "+xor2);

        // int missing=xor1^xor2;
        // System.out.println("Missing: "+missing);
    }
}