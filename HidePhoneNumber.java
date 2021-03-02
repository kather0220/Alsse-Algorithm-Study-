class Solution6 {
    public String solution(String phone_number) {
        
        String[]arr = phone_number.split("");
        for(int i=0;i<arr.length-4;i++)
        	arr[i]="*";
        return String.join("", arr);
        
    }
}
public class HidePhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phone_number = "027778888";
		Solution6 sol = new Solution6();
		System.out.println(sol.solution(phone_number));
	}

}
