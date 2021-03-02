class Solution15 {
    public String solution(int num) {
       
        return (num%2==0)? "Even":"Odd";
    }
}
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4;
		Solution15 sol = new Solution15();
		System.out.println(sol.solution(num));
	}

}
