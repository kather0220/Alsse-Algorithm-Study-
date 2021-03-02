import java.util.Arrays;

class Solution10 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
       
        char[][] char1=new char[arr1.length][5];
        char[][] char2 = new char[arr2.length][5];
       
        for(int i=0;i<arr1.length;i++) {
        	StringBuffer temp1=new StringBuffer(""); 
        	StringBuffer temp2=new StringBuffer(""); 
        	while(arr1[i]!=0) {
        		temp1.append(arr1[i]%2);
        		
        		arr1[i]/=2;
        	}
        	temp1.reverse();
        	
        	char1[i]=(new String(new char[n-temp1.length()]).replace("\0", "0")+temp1).toCharArray();
        	
        	while(arr2[i]!=0) {
        		temp2.append(arr2[i]%2);
        		
        		arr2[i]/=2;
        	}
        	temp2.reverse();
        	
        	char2[i]=(new String(new char[n-temp2.length()]).replace("\0", "0")+temp2).toCharArray();
        	
        }
        
        for(int i=0;i<char1.length;i++) {
        	answer[i]="";
        	for(int j=0;j<char1[i].length;j++) {
        		if(char1[i][j]=='1'||char2[i][j]=='1')
        			answer[i]+="#";
        		else
        			answer[i]+=" ";
        	}
        }
        
        return answer;
    }
}
public class SecretMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int[] arr1 = {46, 33, 33 ,22, 31, 50};
		int[] arr2 = {27 ,56, 19, 14, 14, 10};
		Solution10 sol = new Solution10();
		System.out.println(Arrays.toString(sol.solution(n, arr1, arr2)));
		
	}	

}
