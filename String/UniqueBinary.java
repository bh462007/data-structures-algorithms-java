class UniqueBinary{
    static String findDifferentBinaryString(String[] nums){
        int n=nums.length;
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < n; i++) {
            if(nums[i].charAt(i)=='0'){
                sb.append('1');
            }
            else{
                sb.append('0');
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String[] nums = {"111","011","001"};

        String result = findDifferentBinaryString(nums);

        System.out.println(result);
    }
}



// first thinking:-
// Generate all binary strings of length n

// Check if they exist in the array

// Return the first one that does not exist