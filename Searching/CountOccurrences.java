
class CountOccurrences{

    static int firstIndex(int[] arr, int x){
        int low=0;
        int high=arr.length-1;
        int first=-1;
        while(low <= high){
            int mid=(low+high)/2;
            if(arr[mid] == x){
                first=mid;
                high=mid-1;
            }
            else if(arr[mid] < x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return first;   
    }

    static int lastIndex(int[] arr, int x){
        int low=0;
        int high=arr.length-1;
        int last=-1;
        while(low <= high){
            int mid=(low+high)/2;
            if(arr[mid] == x){
                last=mid;
                low=mid+1;
            }
            else if(arr[mid] < x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return last;
    }

    static int countOccurrences(int[] arr, int x) {
        int first = firstIndex(arr, x);
        if (first == -1) return 0;

        int last = lastIndex(arr, x);
        return last - first + 1;
    }
    
    public static void main(String[] args) {
        int[] arr={2, 2 , 3 , 3 , 3 , 3 , 4};
        int x=3;
        
        int result=countOccurrences(arr, x);
        System.out.println("Count: "+result);
    }
}