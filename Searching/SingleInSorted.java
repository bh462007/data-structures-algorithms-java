class SingleInSorted{
    static int single(int[] arr){
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            ans=ans^arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,1,3,5,5};
        int result=single(arr);
        System.out.println("Result: "+result);
    }
}