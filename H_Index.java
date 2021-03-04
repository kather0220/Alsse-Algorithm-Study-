import java.util.Arrays;
import java.util.Collections;

class Solution4 {
    public int solution(int[] citations) {
        int answer = 0;
        Integer[] arr = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++) {
        	int num=0;
        	for(int j=0;j<citations.length;j++) {
        		if(arr[j]>=i) {
        			num++;
        			System.out.println(num);
        		}
        		
        	}
        	System.out.println(answer+"check");
        	if(num<i) 
        		return i-1;
        	answer=i;
        	System.out.println(answer+"a");
        }
        return answer;
    }
}
public class H_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] citations={4,4,4};
		Solution4 sol = new Solution4();
		System.out.println(sol.solution(citations));
	}

}
