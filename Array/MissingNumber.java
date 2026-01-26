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
    }
}