class Solution3 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);
        for(int i=1;i<arr.length;i++) {
        	int a = Integer.parseInt(arr[i]);
        	if(a>max)
        		max=a;
        	if(a<min)
        		min=a;
        }
        answer=min+" "+max;
        return answer;
    }
}
public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "1 2 3 4";
		String s2 = "-1 -2 -3 -4";
		String s3 = "-1 -1";
		Solution3 sol = new Solution3();
		System.out.println(sol.solution(s1));
		System.out.println(sol.solution(s2));
		System.out.println(sol.solution(s3));

	}

}
