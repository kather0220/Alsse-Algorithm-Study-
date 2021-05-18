import java.util.ArrayList;

class Solution11 {
	public int solution(int[] nums) {
		ArrayList<Integer>arr1 = new ArrayList<>();
		
		int a = 0;
		for(int i=0;i<nums.length/2;i++) {
			while(a<nums.length) {
				if(arr1.contains(nums[a]))
					a++;
				else {
					arr1.add(nums[a]);
					break;
				}
			}
		}
		
		return arr1.size();
	}
}
public class Phoneketmon2 {

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
