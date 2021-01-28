
// 가운데 글자 가져오기
class Solution4 {
    public String solution(String s) {
        String answer = "";
        if(s.length()%2==1) {
        	for(int i=0;i<s.length()/2+1;i++) {
        		if(s.length()-2*i==1)
        			answer=Character.toString(s.charAt(i));
        	}
        }
        else {
        	for(int i=0;i<s.length()/2+1;i++) {
        		if(s.length()-2*i==2) 
        			answer=Character.toString(s.charAt(i))+Character.toString(s.charAt(i+1));
        			
        	}
        }
        return answer;
    }
}

public class MidLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "qwer";
		Solution4 sol = new Solution4();
		System.out.println(sol.solution(s));
	}

}
