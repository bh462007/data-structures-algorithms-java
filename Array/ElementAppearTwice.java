
import java.util.HashMap;

// class ElementAppearTwice{
//     public static void main(String[] args) {
//         int[] arr={1,6,5,3,2,3,4,2,5,6,8,7,3,2};
        
//         int max=14;

//         int[] freq=new int[max+1];
//         for (int i = 0; i < arr.length; i++) {
//             freq[arr[i]]++;
//         }
//         System.out.println("Elements appearing twice:");
//         for (int i = 0; i < freq.length; i++) {
//             if(freq[i]==2){
//                 System.out.println(i+" appeared twice");
//             }
//         }
//     }
// }

class ElementAppearTwice{
    public static void main(String[] args) {
        int[] arr={4,3,2,1,4,3,5,6,2,1,2,1,7,6};
        HashMap<Integer, Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int x=arr[i];
            if(map.containsKey(x)){
                map.put(x, map.get(x)+1);
            }
            else{
                map.put(x, 1);
            }
        }
        System.out.println("Elements appeared twice");
        for(int key : map.keySet()){
            if(map.get(key)==2){
                System.out.println(key+" appears twice");
            }
        }
    }
}