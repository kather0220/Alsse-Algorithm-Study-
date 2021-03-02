import java.util.Arrays;

class Solution2 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        
        for(int i=max;i>=1;i--) {
        	if(n%i==0 && m%i==0) {
        		answer[0]=i;
        		break;
        	}
        }
        
        for(int i=1;i<=min;i++) {
        	if((max*i)%min==0){
        		answer[1] = max*i;
        		break;
        	}
        }
        
        return answer;
    }
}
public class Common {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		int m = 5;
		Solution2 sol = new Solution2();
		System.out.println(Arrays.toString(sol.solution(n, m)));
	}

}
