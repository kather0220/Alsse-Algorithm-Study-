import java.util.Arrays;


class Solution7 {
    public String solution(String number, int k) {
        String answer = "";
        String[] arr1 = number.split("");
        String[] arr2 = number.split("");
        Arrays.sort(arr2);
        
        for(int i=0;i<k;i++) {
        	for(int j=0;j<arr1.length;j++) {
        		if(arr1[j].equals(arr2[i])) {
        			arr1[j]="";
        			break;
        		}
        	}
        }
        answer=String.join("", arr1);
        return answer;
    }
}
public class MakeGreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number = "4177252841";
		int k = 4;
		Solution7 sol = new Solution7();
		System.out.println(sol.solution(number, k));
	}

}
