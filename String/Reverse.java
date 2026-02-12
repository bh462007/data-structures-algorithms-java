class Reverse{
    
    public static void main(String[] args) {
        String s="bhagyashree";
        // System.out.println("Before: "+s);
        // System.out.print("After: ");
        // for (int i = s.length()-1; i >= 0; i--) {
        //     char ch=s.charAt(i);
        //     System.out.print(ch);
        // }

        
        char[] arr=s.toCharArray();
        int low=0;
        int high=s.length()-1;
        while(low < high){
            char temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        String after=new String(arr);
        System.out.println("Reversed: "+after);
    }
}