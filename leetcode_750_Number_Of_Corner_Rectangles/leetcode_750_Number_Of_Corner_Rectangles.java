class Solution {
    public int countCornerRectangles(int[][] grid) {
        
        HashMap <Integer,Integer> map = new HashMap<Integer,Integer>(); 
        int res = 0;
        
        for(int i = 0;i<grid.length;i++)
            for(int j = 0;j<grid[0].length;j++)
            {
                if(grid[i][j] == 1)
                {
                    for(int k = j+1;k<grid[0].length;k++)
                    {
                        if(grid[i][k] == 1)
                        {
                            int pos =  j*1000+k;
                            int c = map.getOrDefault(pos, 0);
                            res = res + c;
                            map.put(pos,c+1);
                        }
                        
                    }
                }
            }
        return res;   
    }
}