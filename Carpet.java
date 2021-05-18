import java.util.Arrays;

class Solution2 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int n = 1;
        int m = 1;
        int width = 0; int height = 0;
        while(n<=brown+yellow) {
        	m = (brown+yellow)/n;
        	if((brown==2*(m+n)-4)&&(yellow==n*m-2*(m+n)+4)) {
        		width = m;
        		height = n;
        		break;
        	}
        	else
        		n++;
        }
        answer[0]=width;
        answer[1]=height;
        return answer;
    }
}
public class Carpet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int brown = 24;
		int yellow = 24;
		Solution2 sol = new Solution2();
		System.out.println(Arrays.toString(sol.solution(brown, yellow)));
	}

}
