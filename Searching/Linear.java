class Linear{
    static int linear(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={4,3,1,2,5};
        int target=3;
        int key=linear(arr, target);
        if(key!=-1){
            System.out.println("Key found at "+key);
        }
        else{
            System.out.println("Not found");
        }
    }
}