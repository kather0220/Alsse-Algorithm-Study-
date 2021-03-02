class Solution9 {
    public String solution(String s) {
        
        int count=1;
        String[] arr = s.split("");
        for(int i=0;i<arr.length;i++) {
        	if(s.charAt(i)==' ')
        		count=0;
        	else if(count%2==0)
        		arr[i]=arr[i].toLowerCase();
        	else 
        		arr[i]=arr[i].toUpperCase();
        	count++;
        }
        return String.join("",arr);
    }
}
public class StrangeWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "try hello world";
		Solution9 sol = new Solution9();
		System.out.println(sol.solution(s));
	}

}
