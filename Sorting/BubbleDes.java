

class BubbleDes{
    static void bubbleDes(int[] arr){
        int n=arr.length;
        boolean flag=false;
        for (int i = n-1; i > 0; i--) {
            
            for (int j = n-1-i; j >= 0; j--) {
                if(arr[j] < arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    flag=true;
                }
            }
            
        }
        if(!flag){
            return;
        }
        for( int num : arr){
            System.out.println(num);
        }
        
        
    }
    public static void main(String[] args) {
        int[] arr={6,5,7,2,3,4,1};
        bubbleDes(arr);
    }
}