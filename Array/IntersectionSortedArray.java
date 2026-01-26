class IntersectionSortedArray{
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={2,3,5};

        int i=0;
        int j=0;
        System.out.println("Intersection: ");
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                i++;
            }
            else if(arr1[i] > arr2[j]){
                j++;
            }
            else{
                System.out.println(arr1[i]+" ");
                i++;
                j++;
            }
        }
    }
}