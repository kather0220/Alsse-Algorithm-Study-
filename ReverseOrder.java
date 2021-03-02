import java.util.*;

class Solution12 {
    public long solution(long n) {
    	
        String[] arr = Long.toString(n).split("");
        Arrays.sort(arr,Collections.reverseOrder());
        String a = String.join("", arr);
        
        return Long.parseLong(a);
    }
}
public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 118372;
		Solution12 sol = new Solution12();
		System.out.println(sol.solution(n));
	}

}
