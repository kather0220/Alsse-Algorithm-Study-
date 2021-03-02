class Solution10 {
    public int solution(int n) {
        int answer = 0;
        while(n!=0) {
        	answer+=n%10;
        	n/=10;
        }
        

        return answer;
    }
}
public class AddDigitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 987;
		Solution10 sol = new Solution10();
		System.out.println(sol.solution(n));
	}

}
