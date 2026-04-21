import java.util.*;

class NextGreaterElement {

    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;

        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        Stack<Integer> st = new Stack<>(); 

        for (int i = 0; i < 2 * n; i++) {

            int curr = nums[i % n];

            while (!st.isEmpty() && nums[st.peek()] < curr) {
                ans[st.pop()] = curr;
            }

            if (i < n) {
                st.push(i);
            }
        }

        return ans;
    }

    public static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        NextGreaterElement obj = new NextGreaterElement();

        int[] a1 = {1, 2, 1};
        print(obj.nextGreaterElements(a1)); 
        
        int[] a2 = {4, 5, 2, 25};
        print(obj.nextGreaterElements(a2)); 
        
        int[] a3 = {5, 4, 3};
        print(obj.nextGreaterElements(a3)); 
        
        int[] a4 = {2, 2, 2};
        print(obj.nextGreaterElements(a4)); 
        
        int[] a5 = {10};
        print(obj.nextGreaterElements(a5)); 
    }
}