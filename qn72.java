class Solution {

    public int uniquePaths(int m, int n) {
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=-1;
            }
        }
        return solve(0,0,m,n,arr);
    }
    public int solve(int i,int j,int m,int n,int arr[][]){
        if(i>=m || j>=n) return 0;
        if(i==m-1 && j==n-1) return 1;
        if(arr[i][j]!=-1) return arr[i][j];
        else return arr[i][j]=solve(i+1,j,m,n,arr)+solve(i,j+1,m,n,arr);
    }
}