class Solution 
{
    public int minMoves2(int[] nums) // find middle element after sorting then calculate moves for this
    {
        Arrays.sort(nums);
        int n=nums.length;
        int moves=0;
        int midEle=nums[(n-1)/2]; // left middle in case of even
        for(int val: nums)
        {
            moves+=Math.abs(midEle-val);
        }

        return moves;
    }
}