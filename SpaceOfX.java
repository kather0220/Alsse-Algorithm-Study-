import java.util.Arrays;

class Solution8 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long temp = (long)x;
        for(int i=0;i<n;i++) {
        	answer[i]=temp;
        	temp+=x;
        }
        return answer;
    }
}
public class SpaceOfX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -4;
		int n = 2;
		Solution8 sol = new Solution8();
		System.out.println(Arrays.toString(sol.solution(x, n)));
	}

}
