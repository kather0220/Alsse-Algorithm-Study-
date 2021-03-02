import java.util.Arrays;

class Solution16 {
    public int solution(String dartResult) {
        int answer = 0;
        String[] arr = dartResult.split("\\*|#|T|S|D");
        int[] nums =Arrays.asList(arr).stream().mapToInt(Integer::parseInt).toArray();
        
        return answer;
    }
}
public class DartGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dartResult = "1D2S#10S";
		Solution12 sol = new Solution12();
		System.out.println(sol.solution(dartResult));
	}

}
