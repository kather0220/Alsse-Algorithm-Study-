import java.util.PriorityQueue;

class Solution3 {
    public int solution(int[] scoville, int K) {
        int mix = 0;
        PriorityQueue<Integer>q = new PriorityQueue<>();
        for(int i=0; i<scoville.length;i++) 
        	q.add(scoville[i]);
        while(q.size()>1) {
        	int min1 = q.poll();
        	int min2 = q.poll();
        	q.add(min1+min2*2);
        	mix++;
        	
        	if(q.peek()<K)
        		continue;
        	else
        		return mix;
        	
        			
        }
        return -1;
    }
}
public class MoreSpicy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		Solution3 sol = new Solution3();
		System.out.println(sol.solution(scoville, K));
	}

}
