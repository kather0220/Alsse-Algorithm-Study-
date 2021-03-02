import java.util.*;
// 내맘대로 정렬하기
class Solution11 {
    
	public String[] solution(String[] strings, int n) {
		
		
		     
		     String[] answer = new String[strings.length];
		        for(int i = 0 ; i < strings.length; i++) {
		            strings[i] = strings[i].charAt(n) + strings[i];
		        }
		        Arrays.sort(strings);
		        
		        for(int i = 0 ; i < strings.length; i++) {
		            answer[i] = strings[i].substring(1,strings[i].length());
		        }
		        return answer;
		  }
		
}
public class SortOnMyOwn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = {"abce", "abcd", "cdx"};
		int n = 1;
		Solution11 sol = new Solution11();
		System.out.println(Arrays.toString(sol.solution(strings, n)));
		}
	}


