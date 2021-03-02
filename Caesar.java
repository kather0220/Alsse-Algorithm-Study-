

class Solution7 {
    public String solution(String s, int n) {
    	
        String answer = "";
        char[] arr = s.toCharArray();
        
        for(int i=0;i<arr.length;i++) {
        	
        	if(arr[i]==' ') 
        		answer+=" ";
        	else if(arr[i]>='a' && arr[i]<='z') {
                if(arr[i]+n > 'z') {
                    arr[i] = (char)(arr[i]+n-26);
                    answer+=arr[i];
                } 
        	}
            else if(arr[i]>='A' && arr[i]<='Z') {
                    if(arr[i]+n > 'Z') {
                        arr[i] = (char)(arr[i]+n-26);
                        answer+=arr[i];
                } 
            }
        	else
        		answer+=Character.toString(arr[i]+n);
        
        }
        return answer;
        }
    }

public class Caesar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char  = 'a';
		//System.out.println(Character.toString(a+5));
		String s = "aa";
		int n = 4;
		Solution7 sol = new Solution7();
		System.out.println(sol.solution(s, n));
	}

}
