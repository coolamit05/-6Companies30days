class Solution 
{
    public boolean canConstruct(String s, int k) // CSWM
    {
        int n=s.length();

        if(n<k)
        {
            return false;
        }
        if(n==k)
        {
            return true;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int countOdd=0;
        for(Character c : map.keySet())
        {
            if(map.get(c)%2!=0)
            {
                countOdd++;
            }
        }
        if(k<countOdd)
        {
            return false;
        }
        return true;
    }
}