class Leetcode153 {

    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                // minimum is in right half
                low = mid + 1;
            } else {
                // minimum is in left half (including mid)
                high = mid;
            }
        }

        return nums[low];
    }

    public static void main(String[] args) {
        Leetcode153 obj = new Leetcode153();

        int[] nums = {3, 4, 5, 1, 2};

        int min = obj.findMin(nums);

        System.out.println("Minimum element is: " + min);
    }
}
