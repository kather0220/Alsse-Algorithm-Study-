import java.util.Arrays;

class Solution2 {
    public int[] solution(String s) {
        int[] answer = new int [2];
        int count = 0;
        int zero = 0;
      
        while(!s.equals("1")) {
        	String temp = s.replaceAll("0", "");
        	zero+=s.length()-temp.length();
        	s = Integer.toBinaryString(temp.length());
        	count++;
        }
        answer[0]=count;
        answer[1]=zero;
        return answer;
    }
}
public class RepeatBinaryConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution2 sol = new Solution2();
		String s = "110010101001";
		System.out.println(Arrays.toString(sol.solution(s)));
		
	}

}
