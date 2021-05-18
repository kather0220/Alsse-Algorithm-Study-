import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Solution5 {
    public boolean solution(String[] phone_book) {
        
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(phone_book));
        Comparator<String> c = new Comparator<String>() { 
        	public int compare(String s1, String s2) { 
        		return Integer.compare(s1.length(), s2.length()); 
        		} 
        	};
        Collections.sort(arr,c);
        for(int i=0;i<arr.size();i++) {
        	for(int j=i+1;j<arr.size();j++) {
        		String sub = arr.get(j).substring(0,arr.get(i).length());
        		if(sub.equals(arr.get(i)))
        			return false;
        	}
        }
        return true;
    }
}
public class PhoneNumberList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] phone_book1 = {"119", "97674223", "1195524421"};
		String[] phone_book2 = {"123", "456", "789"};
		String[] phone_book3 = {"12","123","1235","567","88"};
		
		Solution5 sol = new Solution5();
		System.out.println(sol.solution(phone_book1));
		System.out.println(sol.solution(phone_book2));
		System.out.println(sol.solution(phone_book3));
		}
	}


