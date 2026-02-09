
class RotateSearch{
    static int binarySearch(int[] arr, int k){
        int low=0;
        int high=arr.length-1;
        while(low <= high){
            int mid=low+(high-low)/2;
            if(arr[mid] == k){
                return mid;
            }
            else if(arr[low] <= arr[mid]){
                if(k >= arr[low] && k < arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else //if(arr[mid] <= arr[high])
            {
                if(k > arr[mid] && k <= arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={4, 5, 6, 7, 0, 1, 2};
        int k=0;
        int result=binarySearch(arr,k);
        System.out.println("Result: "+result);
    }
}