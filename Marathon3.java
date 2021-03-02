import java.util.*;

// 완주하지 못한 선수 ( 이클립스에서는 잘 돌아가지만 프로그래머스에서는 똑같이 돌려도 돌아가지 않음 )
class Solution16{
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		Arrays.sort(participant);
		Arrays.sort(completion);
		for(int i=0;i<completion.length;i++) {
			if(!participant[i].equals(completion[i])) {
				answer = participant[i];
				return answer;
			}
		}
		return answer;
    }

}
public class Marathon3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		Solution16 sol = new Solution16();
		System.out.println(sol.solution(participant, completion));
	}

}
