class CopyEle{
    public static void main(String[] args) {
        int[] arr1={4,2,3,5,6,1};
        int[] arr2 = new int[arr1.length];
        int[] arr3 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i]=arr1[i];
        }
        System.out.println(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        
    }
}