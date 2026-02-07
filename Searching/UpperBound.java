// Implement Upper Bound

// Problem Statement: Given a sorted array of N integers and an integer x, write a program to find the upper bound of x.

// What is Upper Bound?
// The upper bound algorithm finds the first or the smallest index in a sorted array where the value at that index is greater than the given key i.e. x.

// The upper bound is the smallest index, ind, where arr[ind] > x.

class UpperBound{
    static int upper(int[] arr, int x){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;

        while(low <= high){
            int mid=(low+high)/2;
            if(arr[mid] > x){
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
        int[] arr={3,5,8,9,15,19};
        int x=9;
        int result=upper(arr,x);
        System.out.println("Upper bound of "+x+" : "+result);
    }
}