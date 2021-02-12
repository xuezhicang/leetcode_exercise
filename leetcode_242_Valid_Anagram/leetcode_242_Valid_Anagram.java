class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] rec = new int[26];
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++)
        {
            int letter_idx_1 = s.charAt(i) - 'a';
            int letter_idx_2 = t.charAt(i) - 'a';
            rec[letter_idx_1] = rec[letter_idx_1] + 1 ;
            rec[letter_idx_2] = rec[letter_idx_2] - 1 ;
            
            //System.out.println(kkk);
        }
        for(int i=0;i<rec.length;i++)
        {
            if(rec[i]!=0)
                return false;
        }
        return true;
    }
}