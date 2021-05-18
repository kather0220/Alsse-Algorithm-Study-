import java.util.Arrays;

class Solution2 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i=0;i<prices.length;i++) {
        	answer[i]=0;
        	int temp=i+1;
        	while(temp<prices.length) {
        		if(prices[i]<=prices[temp])
        			answer[i]++;
        		else {
        			answer[i]++;
        			break;
        		}
        		
        		temp++;
        		
        	}
        }
        
        return answer;
    }
}
public class StockPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {1, 2, 3, 2, 3};
		Solution2 sol = new Solution2();
		System.out.println(Arrays.toString(sol.solution(prices)));
	}

}
