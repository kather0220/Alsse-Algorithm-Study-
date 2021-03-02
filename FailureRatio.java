import java.util.*;

class Solution11 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        HashMap<Integer, Double>h = new HashMap<>();
        for(int i=0;i<N;i++) {
        	int challenge = 0;
            int fail = 0;
        	for(int j=0;j<stages.length;j++) {
        		if(stages[j]>=(i+1)&&stages[j]!=0)
        			challenge++;
        		if(stages[j]==i+1) {
        			fail++;
        			stages[j]=0;
        		}
        		
        	}
        	
        	try {
        	//arr.add(Double.toString(1-(double)fail/challenge)+"/"+Integer.toString(i+1));
        	//System.out.println(arr.get(i));
        	h.put(i+1,1-(double)fail/challenge);
        	}
        	catch(ArithmeticException e) {
            	//arr.add(Integer.toString(0));
        		//System.out.println(arr.get(i));
        		h.put(i+1,1.0);
            }
        	
        }
        
        Collections.sort(arr);
        for(int i=0;i<N;i++) {
        	String [] temp=new String[2];
        	temp = arr.get(i).split("/");
        	answer[i]=Integer.parseInt(temp[1]);
        }
        return answer;
    }
}
public class FailureRatio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 10;
		int[] stages = {1,2,3,4,5,6,7};
		Solution11 sol = new Solution11();
		System.out.println(Arrays.toString(sol.solution(N, stages)));
	}

}
