class Solution2 {
    public String solution(String[] seoul) {
        String answer = "";
        for(int i=0;i<seoul.length;i++)
        	if(seoul[i].equals("Kim"))
        		answer = "김서방은 "+i+"에 있다";
        return answer;
    }
}
public class Kim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] seoul = {"Jane","Kim"};
		Solution2 sol = new Solution2();
		System.out.println(sol.solution(seoul));
	}

}
