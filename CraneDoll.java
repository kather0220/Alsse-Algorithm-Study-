import java.util.*;
// 크레인 인형 뽑기
class Solution15 {
  public int solution(int[][] board, int[] moves) {
    int answer = 0;

    Stack<Integer> stack = new Stack<>();
    
    stack.push(0);

    for (int k : moves) {
      for (int i = 0; i < board.length; i++) {
        if (board[i][k - 1] != 0) {
          if (stack.peek() == board[i][k - 1]) {
            stack.pop();
            answer += 2;
          } 
          else {
           stack.push(board[i][k - 1]);
          }
          board[i][k - 1] = 0;
          break;
        }
      }
    }
    return answer;
  }
}
public class CraneDoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		Solution15 sol = new Solution15();
		System.out.println(sol.solution(board, moves));
	}

}

