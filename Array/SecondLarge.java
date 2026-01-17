
class SecondLarge{
    public static void main(String[] args) {
        int[] arr={5, 1, 9, 9, 7};
        int first=arr[0];
        int second=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(first < arr[i]){
                second=first;
                first=arr[i];          
            }
            else if(arr[i]<first && arr[i]>second){
                second=arr[i];
            }
            else{

            }
        }
        System.out.println(first);
        System.out.println(second);
    }
}