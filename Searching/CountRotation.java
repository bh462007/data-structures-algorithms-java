class CountRotation{
    static int howManyRotate(int[] arr){
        int low=0;
        int high=arr.length-1;
        while(low < high){
            int mid=low+(high-low)/2;
            if(arr[mid] < arr[high]){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2,3};
        int result=howManyRotate(arr);
        System.out.println("Result: "+result);
    }
}