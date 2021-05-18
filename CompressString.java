import java.util.ArrayList;

class Solution6 {
    public int solution(String s) {
        int answer = s.length();
        
        for(int i=1;i<=s.length();i++) {
        	int j=0;
        	ArrayList<String>arr = new ArrayList<>();
        	while(j+i<s.length()) {
        		arr.add(s.substring(j,j+i));
        		j+=i;
        	}
        	arr.add(s.substring(j,s.length()));
        	//System.out.println(arr);
        	StringBuffer str = new StringBuffer();
        	int how_many=1;
        	for(int k=0;k<arr.size();k++) {
        		try {
        		if(arr.get(k).equals(arr.get(k+1)))
        			how_many++;
        		else {
        			str.append((how_many!=1)? how_many+arr.get(k) : arr.get(k));
        			how_many=1;
        		}
        		}catch(IndexOutOfBoundsException e) {
        			if(how_many!=1)
        				str.append(how_many+arr.get(k));
        			else
        				str.append(arr.get(k));
        		}
        		
        		
        		//System.out.println(arr.get(k)+arr.get(k+1));
        	}
        	//if(!arr.get(arr.size()-1).equals(arr.get(arr.size()-2)))
        	//	str.append(arr.get(arr.size()-1));
        		
        	//System.out.println(how_many);
        	
        	//System.out.println(str);
        	if(str.length()<answer)
        		answer=str.length();
        }
        return answer;
    }
}
public class CompressString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "xababcdcdababcdcd";
		Solution6 sol = new Solution6();
		System.out.println(sol.solution(s));

	}

}
