class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        int[][] mem = new int[rowIndex+1][rowIndex+1];
        List<Integer> list_output = new ArrayList<Integer>();
        
        for(int i = 0; i<rowIndex+1; i++)
            for(int j=0; j<=i;j++)
            {
                if(i ==0 || j==0 || i==j)
                    mem[i][j] = 1;
                else
                    mem[i][j] = mem[i-1][j] + mem[i-1][j-1];
                    
                if(i==rowIndex)
                    list_output.add(mem[i][j] );
                    
            }
        
        
        return list_output;
        
        
    }
}