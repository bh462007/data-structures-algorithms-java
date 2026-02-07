class SearchInsert{
    static int insert(int[] arr, int x){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;

        while(low <= high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7};
        int x=5;
        int result=insert(arr,x);
        System.out.println("Index: "+result);
    }
}