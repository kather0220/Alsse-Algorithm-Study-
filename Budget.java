import java.util.Arrays;

class Solution9 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        for(int i=0;i<d.length;i++) {
        	budget-=d[i];
        	if(budget<0)
        		break;
        	answer++;
        }
        return answer;
    }
}
public class Budget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] d = {2,2,3,3};
		int budget = 10;
		Solution9 sol = new Solution9();
		System.out.println(sol.solution(d, budget));
	}

}
