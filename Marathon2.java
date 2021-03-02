import java.util.*;

class Solution2 {
    public String solution(String[] participant, String[] completion) {
    	
    	String answer = "";
    	int i;
    	ArrayList<String> arr = new ArrayList<String>();
    	for(i=0; i<participant.length;i++)
    		arr.add(participant[i]);
    	for(i=0;i<completion.length;i++) {
    		arr.remove(completion[i]);
    	}
    	for(String s:arr) {
    		if (!s.equals(null))
    			answer=s;
    	}
        return answer;
        
    }
}
public class Marathon2 {
	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		Solution2 sol = new Solution2();
		System.out.println(sol.solution(participant, completion));
	}
}



