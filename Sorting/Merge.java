class Merge{
    static void divide(int[] arr, int start, int end){

        if(start >= end){
            return;
        }

        int mid=start+(end - start)/2;

        //divide
        divide(arr, start, mid);
        divide(arr, mid+1, end);

        //merge
        mergeSort(arr, start, mid, end);
    }

    static void mergeSort(int[] arr, int start, int mid, int end){
        int[] temp=new int[end-start+1];

        int i=start;    //left pointer for left subarray
        int j=mid+1;    //right pointer for right subarray
        int k=0;        //temp pointer

        //compare between both the subarrays and pick smaller
        while( i <= mid && j <= end){
            if(arr[j] <= arr[i]){
                temp[k++]=arr[j++];
            }
            else{
                temp[k++]=arr[i++];
            }
        }

        //remaining left elements
        while(i <= mid){
            temp[k++]=arr[i++];
        }

        //remaining right elements
        while(j <= end){
            temp[k++]=arr[j++];
        }

        //copy array
        for (int l = 0; l < temp.length; l++) {
            arr[start+l]=temp[l];
        }

    }

    public static void main(String[] args) {
        int[] arr={4,2,3,1,5};
        divide(arr, 0, arr.length-1);
        for(int num : arr){
            System.out.println(num);
        }
    }
}