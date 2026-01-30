
import java.util.HashMap;

class MajorityElement{
    static int majority(int[] arr){
        HashMap<Integer, Integer> map=new HashMap<>();
        int n=arr.length;

        for(int num:arr){
            map.put(num, map.getOrDefault(num, 0)+1);
            if(map.get(num) > n/2){
                return num;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{3,2,3};
        int k=majority(arr);
        System.out.println(k);
    }
}