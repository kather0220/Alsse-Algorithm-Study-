//p와 y의 개수
class Solution10 {
    boolean solution(String s) {
        boolean answer = true;

        int count = 0;
        
        s=s.toUpperCase();
        
        for(int i=0; i<s.length();i++) {
        	if(s.charAt(i)=='P')
        		count++;
        	else if(s.charAt(i)=='Y')
        		count--;
        }
        
        if(count!=0)
        	answer=false;
        
        return answer;
    }
}

public class PYNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "PyyPpY";
		Solution10 sol = new Solution10();
		System.out.println(sol.solution(s));
	}

}
