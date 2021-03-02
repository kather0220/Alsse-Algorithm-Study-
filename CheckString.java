
class Solution1 {
    public boolean solution(String s) {
        boolean answer = true;
        int i,a=0;
        char[] arr = s.toCharArray();
        if(s.length()!=4&&s.length()!=6)
        	return false;
        
        
        
        for(i=0;i<arr.length;i++) {
        	a = (int)arr[i]-48;
        	if(a<0||a>9)
        		answer = false;
        }
        
        
        
        return answer;
    }
}
public class CheckString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "123";
		//String[] a = s.split("");
		Solution1 sol = new Solution1();
		System.out.println(sol.solution(s));
		//Arrays.sort
		System.out.println((int)'a');
	}

}
