class Solution {
    public boolean isOneEditDistance(String s, String t) {
        if(s.length()<t.length())
            return isOneEditDistance(t,s);
        
        if(s.length() - t.length()>=2)
            return false;
        
        for(int i = 0;i<t.length();i++)
        {
            if(s.charAt(i) != t.charAt(i))
            {
                if(s.length() ==t.length())
                    return s.substring(i+1).equals(t.substring(i+1));
                else
                    return s.substring(i+1).equals(t.substring(i));
            }
        }
        return (s.length() == t.length()+1);
        
    }
}