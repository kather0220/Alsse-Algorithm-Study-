import java.util.Arrays;

class Solution4
{
    public int solution(int []A, int []B)
    {
        
        int sum=0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        int length = A.length-1;
        
        for(int i=0;i<A.length;i++) 
        	sum+= A[i]*B[length-i];
        	
       
        return sum;
    }
}
public class LeastAccumulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {1,4,2};
		int[] B = {5,4,4};
		Solution4 sol = new Solution4();
		System.out.println(sol.solution(A, B));
	}

}
