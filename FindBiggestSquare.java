class Solution5
{
    public int solution(int [][]board)
    {
        
        int max = 0;
        if(board.length==1 && board[0].length==1) {
        	if(board[0][0]==0)
        		return 0;
        	else
        		return 1;
        }
        for(int i=1;i<board.length;i++) {
        	for(int j=1;j<board[i].length;j++) {
        		if(board[i][j]!=0)
        			board[i][j]=Math.min(Math.min(board[i-1][j], board[i][j-1]), board[i-1][j-1])+1;
        		if(board[i][j]>max)
        			max = board[i][j];
        	}
        }
        return max*max;
    }
}
public class FindBiggestSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution5 sol = new Solution5();
		int[][] board1 = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
		int[][] board2 = {{0,0,1,1},{1,1,1,1}};
		int[][] board3 = {{1,0,1}};
		System.out.println(sol.solution(board1));
		System.out.println(sol.solution(board2));
		System.out.println(sol.solution(board3));
	}

}
