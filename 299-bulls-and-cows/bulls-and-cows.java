class Solution 
{
    public String getHint(String secret, String guess) 
    {
        int bulls_count=0;
        int cows_count=0;

        Map<Character,Integer>map=new HashMap<>();
        for(char ch:secret.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<secret.length();i++)
        {
            char char1= secret.charAt(i);
            char char2=guess.charAt(i);

            if(char1==char2)
            {
               bulls_count++;
                map.put(char2,map.get(char2)-1);
                if (map.get(char2) == 0) 
                {
                    map.remove(char2);
                }
            }
        }

        for(int i=0;i<secret.length();i++)
        {
            char char1= secret.charAt(i);
            char char2=guess.charAt(i);

            if(char1 != char2 && map.containsKey(char2) && map.get(char2) > 0)
            {
                {
                    cows_count++;
                    map.put(char2,map.get(char2)-1);
                    if (map.get(char2) == 0) 
                    {
                      map.remove(char2);
                    }
                }
            }
        }
        String s=bulls_count+ "A" + cows_count + "B";
        return s;
        
    }
}