class Solution 
{
    public int waysToSplitArray(int[] nums) 
    {
        int n = nums.length;
        long[] prefArray = new long[n]; // Use long to handle large sums
        long[] sufArray = new long[n];

        // Calculate prefix sum
        prefArray[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefArray[i] = prefArray[i - 1] + nums[i];
        }

        // Calculate suffix sum
        sufArray[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            sufArray[i] = sufArray[i + 1] + nums[i];
        }

        // Count the number of valid splits
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (prefArray[i] >= sufArray[i + 1]) {
                count++;
            }
        }

        return count;
    }
}