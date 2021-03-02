// 3진법 뒤집기
class Solution9 {
    public int solution(int n) {
        int answer = 0;
        String str="";
        while(n!=0) {
        	str+=n%3;
        	n/=3;
        }
        StringBuffer strBuff = new StringBuffer(str);
        str = strBuff.reverse().toString();
        for(int i=0; i<str.length();i++)
        	answer+=Character.getNumericValue(str.charAt(i))*Math.pow(3, i);
        return answer;
    }
}
public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 125;
		Solution9 sol = new Solution9();
		System.out.println(sol.solution(n));
	}

}
