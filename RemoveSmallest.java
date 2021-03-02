import java.util.Arrays;
class Solution14 {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int[] answer2 = {-1};
        
        if(arr.length==1) 
        	return answer2;
        
    
      
        int min = arr[0];
        int i,index=0;
        
        for(i=1;i<arr.length;i++) {
        	if(min>arr[i]) {
        		min=arr[i];
        		index=i;
        	}
        }
        for(i=0;i<index;i++) 
        	answer[i]=arr[i];
        for(i=index;i<arr.length-1;i++)
        	answer[i]=arr[i+1];
        
        return answer;
        
    }
}
public class RemoveSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10};
		Solution14 sol = new Solution14();
		System.out.println(Arrays.toString(sol.solution(arr)));
	}

}
