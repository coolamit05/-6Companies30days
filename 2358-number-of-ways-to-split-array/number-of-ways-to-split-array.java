class Solution 
{
    public int waysToSplitArray(int[] nums) 
    {
        int n = nums.length;
        long[] sufArray = new long[n];

        // Calculate suffix sum
        sufArray[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            sufArray[i] = sufArray[i + 1] + nums[i];
        }

        // Count the number of valid splits
        int count = 0;
        long prefSum=0;
        for (int i = 0; i < n - 1; i++) {
            prefSum+=nums[i];
            if (prefSum >= sufArray[i + 1]) {
                count++;
            }
        }

        return count;
    }
}