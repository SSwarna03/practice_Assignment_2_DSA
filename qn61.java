class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean [][]b=new boolean[n][n];
        List<List<String>> l=new LinkedList();
        N_Queen(b,n,0,l);
        return l;
    }
     void N_Queen(boolean [][]board,int tq,int row,List<List<String>> l){
        if(tq==0){
            display(board,l);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board,row,col)==true){
                board[row][col]=true;
                N_Queen(board,tq-1,row+1,l);
                board[row][col]=false;
            }
        }
    }
      void display(boolean [][]b,List<List<String>> l){
          List<String> ll=new LinkedList();
        for (int i = 0; i < b.length; i++) {
            String s="";
            for (int j = 0; j <b[0].length ; j++) {
                if(b[i][j])s+="Q";
                else s+=".";
            }
            ll.add(s);
        }
        l.add(ll);
    }
     boolean isSafe(boolean [][]b,int row,int col){
        for (int i = row; i >=0 ; i--) {
            if(b[i][col])return false;
        }
        for (int i = row,j=col; i >=0 && j>=0; i--,j--) {
            if(b[i][j])return false;
        }
        for (int i = row,j=col; i >=0 && j<b[0].length; i--,j++) {
            if(b[i][j])return false;
        }
        return true;
    }
}