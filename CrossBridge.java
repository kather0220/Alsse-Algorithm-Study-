import java.util.ArrayList;

class Solution5 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        //ArrayList<Integer>arr = new ArrayList<>();
        //boolean [] is_used = new boolean[truck_weights.length];
        int cross_num=1;
        int sum=truck_weights[0];
        int on_bridge=0;
        while(cross_num<truck_weights.length){
        	if(sum+truck_weights[cross_num]<=weight) {
        		sum+=truck_weights[cross_num];
        		if(sum==truck_weights[cross_num])
        		{	cross_num++;
        			continue;
        		}
        		if(cross_num==truck_weights.length-1) {
        			answer+=sum+1;
        			sum=0;
        			System.out.println("last");
        			
        		}
        		cross_num++;
        	}
        	
        	else {
        		answer+=bridge_length+on_bridge;
        		System.out.println(answer);
        		on_bridge=0;
        		sum=0;
        		//cross_num++;
        		//System.out.println(i+"b");
        		continue;
        	}
        	on_bridge++;
        }
       
        return answer;
    }
}
public class CrossBridge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bridge_length=2;
		int weight=10;
		int[] truck_weights= {7,4,5,6};
		Solution5 sol = new Solution5();
		System.out.println(sol.solution(bridge_length, weight, truck_weights)+"ans");
		
	}

}
