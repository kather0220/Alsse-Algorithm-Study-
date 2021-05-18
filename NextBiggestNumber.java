
class Solution8 {
    public int solution(int n) {
        int answer = 0;
       
        int count1 = 0;
        
        String binary1 = Integer.toBinaryString(n);
        
        for(int i=0;i<binary1.length();i++) {
        	if(binary1.charAt(i)=='1')
        		count1++;
        }
        
        while(true) {
        	String binary2=Integer.toBinaryString(++n);
        	int count2 = 0;
        	
        	for(int i=0;i<binary2.length();i++) {
        		if(binary2.charAt(i)=='1')
        			count2++;
        	}
        	if(count1==count2) {
        		answer=n;
        		break;
        	}
        }
        
        return answer;
    }
   
}
public class NextBiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution8 sol = new Solution8();
		int n = 78;
		System.out.println(sol.solution(n));
		
	}

}
