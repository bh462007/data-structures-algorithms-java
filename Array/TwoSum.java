//use this if array element is sorted

class TwoSum{
    public static void main(String[] args) {
        int target=10;
        int[] arr={1,2,3,4,5,6,7,8,9};
        
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int sum=arr[start]+arr[end];
            if(sum==target){
                System.out.println("Target found");
                return;
            }
            else if(sum<target){
                start++;
            }
            else{
                end--;
            } 
        }
        System.out.println("Target not found");
    }
}