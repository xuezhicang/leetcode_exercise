class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        //sort the people arrya asending
        Arrays.sort(people);
        int res = 0;
        //two pointers i-start,j-end
        int i = 0;
        int j = people.length-1;
        while(i<=j)
        {
            res++;
            if(people[i]+people[j]<=limit)
                i++;
            j--;
        }
        
        return res;
        
    }
}