class Solution {
    public int minDistance(int height, int width, int[] tree, int[] squirrel, int[][] nuts) {
        
        int res = 0;
        int dif =-100;
        for(int i = 0;i<nuts.length;i++)
        {
            res = res + 
                (Math.abs(nuts[i][0]-tree[0]) + Math.abs(nuts[i][1]-tree[1]))*2;
            dif = Math.max(dif,
                Math.abs(nuts[i][0]-tree[0]) + Math.abs(nuts[i][1]-tree[1])-
                Math.abs(nuts[i][0]-squirrel[0]) - Math.abs(nuts[i][1]-squirrel[1]));
        }
        res = res-dif;
        return res;
        
    }
}