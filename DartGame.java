import java.util.ArrayList;
import java.util.Arrays;

class Solution12 {
    public int solution(String dartResult) {
        int answer = 0;
        int[] arr = new int[3];
        String[] arr2 = dartResult.split("\\*|#");
        System.out.println(Arrays.toString(arr2));
        ArrayList<Character>ch = new ArrayList<>();
        for(int i=0;i<dartResult.length();i++) {
        	if(dartResult.charAt(i)=='*'||dartResult.charAt(i)=='#')
        		ch.add(dartResult.charAt(i));
        }
        String str = String.join("", arr2);
        System.out.println(str);
        for(int i=1;i<str.length();i+=2) {
        	switch(str.charAt(i)) {
        	case 'S':
        		arr[i/2]=str.charAt(i-1)-'0';
        		break;
        	case 'D':
        		arr[i/2]=(int) Math.pow(str.charAt(i-1)-'0', 2);
        		break;
        	case 'T':
        		arr[i/2]=(int) Math.pow(str.charAt(i-1)-'0', 3);
        		break;
        	}
        }
        for(int i=0;i<dartResult.length();i++) {
        	switch(dartResult.charAt(i)) {
        	case '*':
        		if(i/3==0)
        			arr[i/3]*=2;
        		else
        		{
        			arr[i/3]*=2;
        			arr[i/3-1]*=2;
        		}
        		break;
        		
        	case '#':
        		arr[i/3]*=-1;
        		break;
        	default:
        		break;
        	}
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        /*
        for(int i=0;i<ch.size();i++) {
        	if(ch.get(i)=='*') {
        		if(i==0)
        			arr[i]*=2;
        		else
        		{
        			arr[i-1]*=2;
        			arr[i]*=2;
        		}
        	}
        	else {
        		arr[i]*=-1;
        	}
        }
        */
        //System.out.println(arr[0]);
        //System.out.println(arr[1]);
        //System.out.println(arr[2]);
        answer=arr[0]+arr[1]+arr[2];
        return answer;
    }
}
public class DartGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dartResult = "1D2S#10S";
		Solution12 sol = new Solution12();
		System.out.println(sol.solution(dartResult));
	}

}
