class Solution3 {
    public int solution(int num) {
        int answer = 0;
        while(num!=1) {
        	num=(num%2==0)? num/2:num*3+1;
        	answer++;
        }
        //if(answer>500)
        	//answer=-1;
        
        return answer;
    }
}
public class Collatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 626331;
		Solution3 sol = new Solution3();
		System.out.println(sol.solution(num));
	}

}
