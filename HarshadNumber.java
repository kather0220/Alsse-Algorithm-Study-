class Solution5 {
    public boolean solution(int x) {
       
        int num=0, temp=x;
        
        while(temp!=0) {
        	num+=temp%10;
        	temp/=10;
        }
        
        return (x%num==0)? true:false;
    }
}
public class HarshadNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 13;
		Solution5 sol = new Solution5();
		System.out.println(sol.solution(x));
	}

}
