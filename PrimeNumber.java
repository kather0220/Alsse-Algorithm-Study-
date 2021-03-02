class Solution3 {
  public int solution(int n) {
		int answer = 0;
		boolean[] is_prime = new boolean[n + 1];
 
		for (int i = 2; i <= n; i++) {
			if (!is_prime[i])
				answer++;
			for (int j = i; j <= n; j += i) 
					is_prime[j] = true;
		}      
      return answer;
  }
}
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		Solution3 sol = new Solution3();
		System.out.println(sol.solution(n));
	}

}
