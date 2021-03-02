import java.util.*;
// 내림차순 정렬하기
class Solution12 {
    public String solution(String s) {
       String[] arr = s.split("");
       Arrays.sort(arr,Collections.reverseOrder());
       String answer = String.join("", arr);
       return answer;
       
    }
}
public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Zbcdefg";
		Solution12 sol = new Solution12();
		System.out.println(sol.solution(s));

	}

}
