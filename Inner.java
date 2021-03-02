class Solution6 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i=0;i<a.length;i++)
        	answer+=a[i]*b[i];
        
        return answer;
    }
}
public class Inner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution6 sol = new Solution6();
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		System.out.println(sol.solution(a, b));
	}

}
