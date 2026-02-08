class LastOccurrence{
    static int firstOccurrence(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low <= high){
            int mid=low+(high-low)/2;
            if(arr[mid] == target){
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid] < target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }

    static int lastOccurrence(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low <= high){
            int mid=low+(high-low)/2;
            if(arr[mid] == target){
                ans=mid;
                low=mid+1;
            }
            else if(arr[mid] < target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={3, 4, 13, 13, 13, 20, 40, 40};
        int target=40;

        int first=firstOccurrence(arr, target);
        int last=lastOccurrence(arr,target);

        if(first != -1){
            int relativeIndex=last-first;
            System.out.println("Index: "+relativeIndex);
        }
        System.out.println("Last occurrences of "+target+" : "+last);
    }
}