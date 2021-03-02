import java.util.*;
// 나누어 떨어지는 숫자 배열
class Solution7 {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++) {
        	if(arr[i]%divisor==0)
        		answer.add(arr[i]);
        }
        if(answer.isEmpty())
        	answer.add(-1);
        Collections.sort(answer);
        return answer;
    }
}
public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,6};
		int divisor = 10;
		Solution7 sol = new Solution7();
		System.out.println(sol.solution(arr, divisor));
	}

}
