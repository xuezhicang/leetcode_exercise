class Solution {
    public int[][] diagonalSort(int[][] mat) {
        // hashmap to keep the diagonals
        HashMap<Integer, PriorityQueue<Integer>> h = new HashMap<>();
        

        //fill thehashmap
        for(int i =0;i<mat.length;i++)
            for(int j=0;j< mat[0].length;j++)
            {
                h.putIfAbsent(i-j, new PriorityQueue<Integer>() );
                h.get(i-j).add(mat[i][j]);
            }
        
        //put the number to the mat
        for(int i =0;i<mat.length;i++)
            for(int j=0;j< mat[0].length;j++) 
            {
                mat[i][j] = h.get(i-j).poll();
            }
        
        return mat;
    }
}