import java.util.Arrays;

class Solution11 {
    public int[] solution(long n) {
        int[] answer = new int[Long.toString(n).length()];
        int i=0;
        while(i<answer.length) {
        	answer[i]=(int) (n%10);
        	n/=10;
        	i++;
        }
        return answer;
    }
}
public class ShiftString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 12345;
		Solution11 sol = new Solution11();
		System.out.println(Arrays.toString(sol.solution(n)));
		
	}

}
