class SubarrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 9;

        int left = 0;
        int sum = 0;
        int count = 0;
        for (int right = 0; right < arr.length; right++) {

            sum += arr[right];
            while (sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                count++;
            }
        }
        System.out.println("Count of subarrays: " + count);
    }
}
