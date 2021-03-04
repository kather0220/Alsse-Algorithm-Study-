import java.util.ArrayList;

class Solution10 {
	 
	  static void search(int[] arr, boolean[] visited, int start, int r, int[] a) {
	        if(r == 0) {
	            check(arr, visited, a);
	            return;
	        } else {
	            for(int i = start; i < arr.length; i++) {
	                visited[i] = true;
	                search(arr, visited, i + 1, r - 1, a);
	                visited[i] = false;
	            }
	        }
	    }
	  static void check(int[] arr, boolean[] visited, int[] a) {
		  	ArrayList<Integer>list = new ArrayList<>();
		  	int count = 0;
		  	for(int i = 0; i < arr.length; i++) {
	            if(visited[i] == true) {
	            	if(!list.contains(arr[i])){
	            		list.add(arr[i]);
	            		count++;
	            }
	                
	        }
	        
	    }
		  if(count>a[0])
			  a[0] = count;
	  }

	  
    public int solution(int[] nums) {
    	boolean[] visited = new boolean[nums.length];
    	
    	int[] a = {0};
    	search(nums, visited, 0, nums.length/2,a);
        return a[0];
    }
}
public class Phoneketmon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution10 sol = new Solution10();
		
		int[] nums2 = {3,3,3,2,2,4};
		int[] nums3 = {3,3,3,2,2,2};
		int[] nums4 = {1,1,1,1};
		int[] nums1 = {3,1,2,3};
		System.out.println(sol.solution(nums4));
		System.out.println(sol.solution(nums2));
		System.out.println(sol.solution(nums3));
		System.out.println(sol.solution(nums1));
	}

}
