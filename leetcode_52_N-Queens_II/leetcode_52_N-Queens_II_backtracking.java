class Solution {
    int count = 0;
    public int totalNQueens(int n) 
    {
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
            {
                board[i][j] = '.';
            }
        
        dfs(board,0);
        return count;
        
    }
    
    public void dfs(char[][] board,int chess_number)
    {
        if(chess_number == board.length)
        {
            count++;
            return;    
        }
        for(int i= 0;i<board.length;i++)
        {
            if(valid(board,i,chess_number))
            {
                board[i][chess_number] = 'Q';
                dfs(board,chess_number+1);
                board[i][chess_number] = '.';
            }
        }
    }
    
    private boolean valid(char[][] board, int x, int y)
    {
        for(int i = 0; i<board.length;i++)
            for(int j =0;j<y;j++)
            {
                if(board[i][j]=='Q' && (x==i || x-y == i-j || x+y== i+j))
                    return false;
                
            }
        return true;
    }
}