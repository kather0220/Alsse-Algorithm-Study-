
class Solution1 {
    public String solution(String[] participant, String[] completion) {
    	
    	String answer = "";
    	int i,j;
    	for(i=0;i<participant.length;i++) {
    		for(j=0; j<completion.length;j++) {
    			if(participant[i].equals(completion[j])) {
    					completion[j]="";
    					break;
    			}
    			else if(j==completion.length-1)
    				answer=participant[i];
    		}
    	}
        return answer;
        
    }
}
public class Marathon {
	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		Solution1 sol = new Solution1();
		System.out.println(sol.solution(participant, completion));
	}
}
