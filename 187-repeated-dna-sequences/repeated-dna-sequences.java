class Solution 
{
    public List<String> findRepeatedDnaSequences(String s) 
    {
        List<String> list=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        int n=s.length();
        for (int i = 0; i <= n - 10; i++) 
        {
            String substring = s.substring(i, i + 10); // Get substring of length 10
            map.put(substring, map.getOrDefault(substring, 0) + 1);
        }
        for (String key : map.keySet()) {
            if (map.get(key) > 1) {
                list.add(key);
            }
        }
        return list;
    }
}