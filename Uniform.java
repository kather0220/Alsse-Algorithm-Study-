
// Ã¼À°º¹
class Solution14 {
    public int solution(int n, int[] lost, int[] reserve) {
    	
        int answer = n-lost.length;
        int i,j;
        
        for(i=0;i<lost.length;i++)
        	for(j=0;j<reserve.length;j++) 
        		if(lost[i]==reserve[j]) {
        			answer++;
        			lost[i]=0;
        			reserve[j]=0;
        			break;
        		}
       
        	
       
        
        for(i=0;i<lost.length;i++) 
        	if(lost[i]!=0)
        		for(j=0;j<reserve.length;j++)
        		{
        			if(reserve[j]!=0) 
        				if(lost[i]==reserve[j]-1||lost[i]==reserve[j]+1)
        				{	
        					lost[i]=0;
        					reserve[j]=0;
        					answer++;
        					break;
        				}
        			
        		}
        
        
        return answer;
    }
}
public class Uniform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int[] lost = {3};
		int[] reserve = {1};
		Solution14 sol = new Solution14();
		System.out.println(sol.solution(n, lost, reserve));

	}

}
