class Pallindrome{
    public static void main(String[] args) {
        String s="mama";
        
        char[] arr=s.toCharArray();
        int low=0;
        int high=arr.length-1;
        while(low < high){
            if(arr[low] == arr[high]){
                low++;
                high--;
            }
            else{
                System.out.println("Not pallindrome");
                return;
            }
        }
        System.out.println("Pallindrome");
        
    }
}