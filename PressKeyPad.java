class Solution1 {
	public int distance(int n, int m) {
		
		int dist=0;
		
		if(n==1||n==3)
		{
			if(m==2)dist = 1;
			if(m==5)dist = 2;
			if(m==8)dist = 3;
			if(m==0)dist = 4;
		}
		else if(n==4||n==6)
		{
			if(m==2)dist = 2;
			if(m==5)dist = 1;
			if(m==8)dist = 2;
			if(m==0)dist = 3;
		}
		
		else if(n==7||n==9)
		{
			if(m==2)dist = 3;
			if(m==5)dist = 2;
			if(m==8)dist = 1;
			if(m==0)dist = 2;
			
		}
		else if(n==2)
		{
			
				if(m==2)dist = 0;
				if(m==5)dist = 1;
				if(m==8)dist = 2;
				if(m==0)dist = 3;
				
			}
		else if(n==5)
		{
			if(m==2)dist = 1;
			if(m==5)dist = 0;
			if(m==8)dist = 1;
			if(m==0)dist = 2;
			
		}
		else if(n==8)
		{
			if(m==2)dist = 2;
			if(m==5)dist = 1;
			if(m==8)dist = 0;
			if(m==0)dist = 1;
			
		}
		else if(n==0)
		{
			if(m==2)dist = 3;
			if(m==5)dist = 2;
			if(m==8)dist = 1;
			if(m==0)dist = 0;
			
		}
		else if(n==-1) {
			if(m==2)dist = 4;
			if(m==5)dist = 3;
			if(m==8)dist = 2;
			if(m==0)dist = 1;
		}
		return dist;
		
	}
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int right_pos=-1;
        int left_pos=-1;
        for(int i=0;i<numbers.length;i++) {
        	
        	switch(numbers[i]) {
        	case 1: case 4: case 7:
        		answer+="L";
        		left_pos = numbers[i];
        		break;
        	case 3: case 6: case 9:
        		answer+="R";
        		right_pos = numbers[i];
        		break;
        	case 2: case 5: case 8: case 0:
        		int right_dis = distance(right_pos, numbers[i]);
        		int left_dis = distance(left_pos, numbers[i]);
        		
        		if(right_dis<left_dis)
        		{
        			answer+="R";
        			right_pos = numbers[i];
        		}
        		else if(right_dis>left_dis)
        		{
        			answer+="L";
        			left_pos = numbers[i];
        		}
        		else
        		{
        			if(hand.equals("right")) {
            			answer+="R";
            			right_pos = numbers[i];
            		}
            		
            		else {
            			answer+="L";
            			left_pos = numbers[i];
            		}
        		}
        		break;
        			
        		
        	}
        }
        return answer;
    }
}
public class PressKeyPad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		String hand = "right";
		Solution1 sol = new Solution1();
		System.out.println(sol.solution(numbers, hand));
	}

}
