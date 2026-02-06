
class Binary{
    static int binary(int[] arr, int target){
        int low=0;
        int high=arr.length-1;

        while(low <= high){
            int mid=(low + high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid] > target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        int target=5;
        int key=binary(arr, target);
        if(key!=-1){
            System.out.println("Key found at "+key);
        }
        else{
            System.out.println("Not found");
        }
        
    }
}