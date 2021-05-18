import java.util.ArrayList;
import java.util.Arrays;

class Solution3 {
    public int[] solution(int[] progresses, int[] speeds) {
        //int[] answer = {};
        int put = 0;
        int temp = 0;
        ArrayList<Integer>arr = new ArrayList<>();
        int[] diff = new int[progresses.length];
        for(int i=0;i<diff.length;i++) {
        	diff[i]=(100-progresses[i])/speeds[i];
        	if((100-progresses[i])%speeds[i]!=0)
        		diff[i]++;
        }
        //Arrays.sort(diff);
        System.out.println(Arrays.toString(diff));
        try {
        for(int i=0;i<diff.length;i++) {
        	//put++;
        	if(put==0)
        		temp=diff[i];
        	//put++;
        	
        	if(temp<diff[i])
        	{	
        		arr.add(put);
        		put=0;
        		continue;
        		
        	}
        	put++;
        	
        }
        }catch(ArrayIndexOutOfBoundsException e) {
        	arr.add(put);
        }
        
        int[] answer = new int[arr.size()];
        for(int i=0;i<arr.size();i++) 
        	answer[i]=arr.get(i);
        
        //answer=arr.toArray(new Integer[arr.size()]);
        return answer;
    }
}
public class FunctionDevelopment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] progresses = {99, 1, 99, 1};
		int[] speeds = {1, 1, 1, 1};
		Solution3 sol  = new Solution3();
		System.out.println(Arrays.toString(sol.solution(progresses, speeds)));
		
	}

}
