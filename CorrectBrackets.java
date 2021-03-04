import java.util.*;  

class Solution6 {
    boolean solution(String s) {
       
        Stack<Character>stk = new Stack<>();
        for(int i=0;i<s.length();i++) {
        	char c = s.charAt(i);
        	if(c=='(')
        		stk.push(c);
        	else {
        		if(stk.isEmpty())
        			return false;
        		else if(c==stk.pop())
        			return false;
        		else 
        			continue;
        	}
        }
        if(!stk.isEmpty())
        	return false;

        return true;
    }
}
public class CorrectBrackets {

	public static void main(String[] args) {
		String s = "(()(";
		Solution6 sol = new Solution6();
		System.out.println(sol.solution(s));
		
				
	}

}

