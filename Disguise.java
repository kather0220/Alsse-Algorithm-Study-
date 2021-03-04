import java.util.ArrayList;
import java.util.HashMap;

class Solution6 {
    public int solution(String[][] clothes) {
        
        int answer=1;
        HashMap<String, Integer>h = new HashMap<>();
        ArrayList<String>arr = new ArrayList<>();
        for(int i=0;i<clothes.length;i++) {
        	if(h.containsKey(clothes[i][1]))
        		h.put(clothes[i][1], h.get(clothes[i][1])+1);
        	else {
        		h.put(clothes[i][1],1);
        		arr.add(clothes[i][1]);
        	}
        }
        
        
        for(int i=0;i<arr.size();i++) {
        	answer*=h.get(arr.get(i))+1;
        }
        answer-=1;
        return answer;
    }
}
public class Disguise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][]clothes1 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		String[][]clothes2 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
		Solution6 sol = new Solution6();
		System.out.println(sol.solution(clothes1));
		System.out.println(sol.solution(clothes2));
	}

}
