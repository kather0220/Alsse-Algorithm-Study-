import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


class Solution7 {
    public int[] solution(String s) {
        //int[] answer = {};
    	//s=s.substring(2,s.length()-2);
    	ArrayList<String>str= new ArrayList<>();
    	for(int i=0;i<s.length();i++) {
    		char c = s.charAt(i);
    		if(Character.isDigit(c));
    			
    	}
    	
    	Collections.sort(str);
    	//System.out.println(Arrays.deepToString(str));
    	//System.out.println(s);
        //String[] temp = s.split("\\},{|,");
        //|\\},{|\\}}|,
        //System.out.println(Arrays.toString(temp));
        ArrayList<Integer> arr = new ArrayList<>();
        //Collections.sort(arr);
        //Arrays.sort(temp);
        /*
        for(int i=0;i<s.length();i++) {
        	try {
        	int a = (int)(s.charAt(i));
        	if(Character.isDigit(s.charAt(i)))
        		arr.add(s.charAt(i));
        	}catch(Exception e) {
        		
        	}
        }
        */
        /*
        Comparator<String> c = new Comparator<String>() { 
        	public int compare(String s1, String s2) { 
        		return Integer.compare(s1.length(), s2.length()); 
        		} 
        	};

      Collections.sort(arr,c);
      */
        int n = 0;
        int k=0;
        for(int i=0;i<str.size();i++) {
        	if(str.get(i)==str.get(0))
        		k++;
        	else
        		break;
        }
        while(n<str.size()) {
        	arr.add(Integer.parseInt(str.get(n)));
        	n+=k;
        	k--;
        }
        
        int[] answer = new int[arr.size()];
        
        for(int i=0;i<arr.size();i++) {
        	answer[i]=arr.get(i);
        }
        return answer;
    }
}
public class Tuple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution7 sol = new Solution7();
		String s = "{{2},{2,1},{2,1,3},{2,1,3,4}}";
		System.out.println(Arrays.toString(sol.solution(s)));
	}

}
