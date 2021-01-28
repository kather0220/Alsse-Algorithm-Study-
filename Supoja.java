import java.util.*;
// 모의고사
class Solution3 {
    public  ArrayList<Integer> solution(int[] answers) {
    	
    	int i;
    	int[] correct = new int[3];
    	
    	for(i=0;i<answers.length;i++) {
    		if(i%5==answers[i]-1)
    			correct[0]++;
    	}
    	for(i=0;i<answers.length;i++) {
    		if(i%2==0&&answers[i]==2)
    			correct[1]++;
    		else if(i%8==1&&answers[i]==1)
    			correct[1]++;
    		else if(i%8==3&answers[i]==3)
    			correct[1]++;
    		else if(i%8==5&answers[i]==4)
    			correct[1]++;
    		else if(i%8==7&&answers[i]==5)
    			correct[1]++;
    		else
    			continue;
    			
    	}
    	for(i=0;i<answers.length;i++) {
    		switch(i%10) {
    		case 0: case 1:
    			if(answers[i]==3)
    				correct[2]++;
    			break;
    		case 2: case 3:
    			if(answers[i]==1)
    				correct[2]++;
    			break;
    		case 4: case 5:
    			if(answers[i]==2)
    				correct[2]++;
    			break;
    		case 6: case 7:
    			if(answers[i]==4)
    				correct[2]++;
    			break;
    		case 8: case 9:
    			if(answers[i]==5)
    				correct[2]++;
    			break;
    		}
    			
    	}
    	
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int j=0;
        if(correct[0]>=correct[1]&&correct[0]>=2)
        	answer.add(1);
        
        if(correct[1]>=correct[0]&&correct[1]>=2) 
        	answer.add(2);
        
        if(correct[2]>=correct[0]&&correct[2]>=1) 
        	answer.add(3);
        
        return answer;
    }
}
public class Supoja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answers = {1,2,3,4,5};
		Solution3 sol = new Solution3();
		System.out.println(sol.solution(answers));
	}

}
