// used HashSet for existence, duplicates, uniqueness

import java.util.HashSet;

class ContainsDuplicate{
    static boolean isDuplicate(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i])){
                return true;
            }
            else{
                set.add(arr[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,1};
        boolean k=isDuplicate(arr);
        if(k){
            System.out.println("Duplicate exists");
        }
        else{
            System.out.println("No Duplicate");
        }
    }
}