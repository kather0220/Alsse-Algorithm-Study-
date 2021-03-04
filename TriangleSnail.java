class Solution4 {
    public int[] solution(int n) {
        int[] answer = new int[n*(n+1)/2];
        int index=0;
        int i=1;
        while(true) {
        	answer[index]=i;
        	if(index+i>answer.length)
        		break;
        	index+=i;
        	i++;
        }
        while(index<answer.length-1) {
        	answer[++index]=++i;
        }
        while(true) {
        	
        }
        
       // return answer;
    }
}
public class TriangleSnail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
