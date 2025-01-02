class Solution 
{
    public int findTheWinner(int n, int k) 
    {
        List<Integer> friends = new ArrayList<>();
        for (int i = 1; i <= n; i++) 
        {
            friends.add(i);
        }
        int curr_pos = 0;
        while (n > 1) 
        {
            curr_pos = (curr_pos + (k - 1)) % n; // important
            friends.remove(curr_pos);
            n--;
        }
        
        return friends.get(0);
    }
}