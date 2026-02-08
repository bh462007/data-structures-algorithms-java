class FloorCeil{
    static int floor(int[] arr, int x){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low <= high){
            int mid=(low+high)/2;
            if(arr[mid] <= x){
                ans=arr[mid];
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    static int ceil(int[] arr, int x){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low <= high){
            int mid=(low+high)/2;
            if(arr[mid] >= x){
                ans=arr[mid];
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int x=5;

        int f=floor(arr, x);
        int c=ceil(arr, x);
        System.out.println("Floor of "+x+" : "+f);
        System.out.println("Ceil of "+x+" : "+c);

    }
}