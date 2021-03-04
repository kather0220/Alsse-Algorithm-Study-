import java.util.ArrayList;
import java.util.Collections;


class Solution8 {
	/*
	static String cut(int k,String number, ArrayList<Integer>list) {
		int max = Collections.max(list);
		String str = "";
		
		if(number.indexOf(max)>k)
			str = cut(k, number.substring(0,number.indexOf(max)), (ArrayList<Integer>) list.subList(0, number.indexOf(max)));
		else {
			str= number.substring(number.indexOf(max));
			k-=number.indexOf(max);
		}
		return str;
	}
	*/
	/*
	static String cut(int k, String number, ArrayList<Integer>list) {
		int max = Collections.max(list);
		String str = "";
		if(number.indexOf(max)>k)
			
	}
	*/
    public String solution(String number, int k) {
        String answer = "";
        String[] arr = number.split("");
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        	list.add(Integer.parseInt(arr[i]));
        while(k>=0) {
        	int max = Collections.max(list);
        	if(number.indexOf(max)>k) {
        	
        	}
        
        }
        return answer;
    }
}
public class MakeBiggest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
