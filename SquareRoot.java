class Solution13 {
    public long solution(long n) {
        long answer = 0;
        if((long)Math.pow((int)Math.sqrt(n),2)==n)
        	answer=(long) Math.pow(Math.sqrt(n)+1, 2);
        else
        	answer=-1;
        return answer;
    }
}
public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		Solution13 sol = new Solution13();
		System.out.println(sol.solution(n));
	}

}
