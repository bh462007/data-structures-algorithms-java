
import java.util.HashMap;

// class ElementAppearOnce{
//     public static void main(String[] args) {
//         int[] arr={2,3,2,5,3,4,6,1};
//         int max=8;

//         int[] freq=new int[max+1];

//         for (int i = 0; i < arr.length; i++) {
//             freq[arr[i]]++;
//         }
//         for (int i = 0; i < arr.length; i++) {
//             if(freq[arr[i]]==1){
//                 System.out.println(arr[i]+" appered once");
//             }
//         }
//     }
// }



// Frequency array works ONLY when:
// - element values are small
// - range is known

class ElementAppearOnce{
    public static void main(String[] args) {
        int[] arr={2,3,2,4,5,4,1,2,1,3,4};
        HashMap <Integer, Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int x=arr[i];
            if(map.containsKey(x)){
                map.put(x, map.get(x)+1);
            }
            else{
                map.put(x, 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1) {
                System.out.println(arr[i] + " appeared once");
            }
        }
    }
}