// Implement Lower Bound

// Problem Statement: Given a sorted array of N integers and an integer x, write a program to find the lower bound of x.

// What is lower bound?
// The lower bound algorithm finds the first or the smallest index in a sorted array where the value at that index is greater than or equal to a given key i.e. x.

// The lower bound is the smallest index, ind, where arr[ind] >= x. But if any such index is not found, the lower bound algorithm returns n i.e. size of the given array.



class LowerBound{
    static int lower(int[] arr, int x){
        int n=arr.length;
         int low=0;
         int high=n-1;
         int ans=arr.length;
         while(low <= high){
            int mid=(low+high)/2;

             if(arr[mid] >= x){
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
        int[] arr={1,2,2,3,4,5};
        int x=2;
        int result=lower(arr,x);
        System.out.println("Lower bound of "+x+" : "+result);
    }
}