import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class Solution1 {
	
	//static ArrayList<String>list = new ArrayList<>();
	//static HashMap<String, Integer> h= new HashMap<>();
    static void comb(String[] arr, boolean[] visited, int start, int r, HashMap<String, Integer> h) {
        if(r == 0) {
            insert(arr, visited, h);
            return;
        } else {
            for(int i = start; i < arr.length; i++) {
                visited[i] = true;
                comb(arr, visited, i + 1, r - 1, h);
                visited[i] = false;
            }
        }
    }
 
    static void insert(String[] arr, boolean[] visited, HashMap<String, Integer> h) {
    	
    	String add="";
        for(int i = 0; i < arr.length; i++) {
        	
            if(visited[i] == true)
                add+=arr[i];
        }
        
        if(h.containsKey(add)) {
        	int a = h.get(add)+1;
        	h.remove(add);
        	h.put(add,a);
        }
        else
        	h.put(add,1);
        
    }
    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        ArrayList<String> ans_list = new ArrayList<>();
        for(int j=0;j<course.length;j++) {
        	HashMap<String, Integer> h= new HashMap<>();
        	for(int i=0;i<orders.length;i++)
        	{
        		String[] arr = orders[i].split("");
        		Arrays.sort(arr);
        		boolean[] visited = new boolean[arr.length];
        		comb(arr,visited,0,course[j],h);
        	}
        	int max=0;
        	for(int a : h.values())
        		if(a>max)
        			max=a;
        	//System.out.println(max);
        	if(max==1||max==0)
        		continue;
        	for(int a : h.values())
        		if(a==max) {
        			String save = getKey(h,a);
        			ans_list.add(save);
        			//h.remove(getKey(h,a));
        			h.put(save,0);
        		}
        	//System.out.println(h);
        }
        answer=ans_list.toArray(new String[ans_list.size()]);
        Arrays.sort(answer);
        return answer;
    }

    static <K, V> K getKey(HashMap<K, V> map, V value) {
       
        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
               return key;
            }
        }
        return null;
    }

}


public class MenuRenewal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String[] orders = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
			int[] course = {2,3,5};
			Solution1 sol  = new Solution1();
			System.out.println(Arrays.toString(sol.solution(orders, course)));
	}

}
