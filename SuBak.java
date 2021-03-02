class Solution4 {
    public String solution(int n) {
        String answer = "";
        int i;
        
        for(i=0;i<n/2;i++)
        	answer+="¼ö¹Ú";
        if(n%2==1)
        	answer+="¼ö";
        return answer;
    }
}
public class SuBak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		Solution4 sol = new Solution4();
		System.out.println(sol.solution(n));

	}

}
