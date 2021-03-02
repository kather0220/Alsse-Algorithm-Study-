class Solution4 {
    public double solution(int[] arr) {
    	int sum = 0;
        for(int i=0;i<arr.length;i++)
        	sum+=arr[i];
        return (double)sum/arr.length;
    }
}
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4};
		Solution4 sol = new Solution4();
		System.out.println(sol.solution(arr));
	}

}
