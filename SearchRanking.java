import java.util.ArrayList;
import java.util.Arrays;


class Solution3 {
    public int[] solution(String[] info, String[] query) {
        int[] answer = new int [query.length];
        String[][] info_arr = new String[info.length][5];
        ArrayList<Integer>minus_one = new ArrayList<>();
        minus_one.add(-1);
        for(int i=0;i<info.length;i++) 
        	info_arr[i]=info[i].split(" ");
        //System.out.println(info_arr[0][0]);
        //System.out.println(info_arr[1][0]);
        for(int i=0;i<query.length;i++) {
        	String[] query_arr = query[i].split(" and | ");
        	
        	//System.out.println(Arrays.toString(query_arr));
        	ArrayList<Integer>arr = new ArrayList<>();
        	for(int j=0;j<info_arr.length;j++) {
        		if(query_arr[0].equals("-")) {
        			for(int k=0;k<info_arr.length;k++) 
        				arr.add(k);
        			break;
        		}
        			
        		else if(query_arr[0].equals(info_arr[j][0]))
        			arr.add(j);
        	}
        	/*
        	if(arr.size()>=2){
        	System.out.println(arr.get(0));
        	System.out.println(arr.get(1));
        	}
        	*/
        	arr.removeAll(minus_one);
        	//System.out.println(arr.size()+"size0");
        	
        	if(arr.isEmpty())
        	{
        		answer[i]=0;
        		continue;
        	}
        	
        	for(int j=0;j<arr.size();j++) {
        		if(query_arr[1].equals("-"))
        			break;
        		else if(!query_arr[1].equals(info_arr[arr.get(j)][1]))
        			arr.set(j,-1);
        	}
        	arr.removeAll(minus_one);
        	//System.out.println(arr.size()+"size1");
        	
        	if(arr.isEmpty())
        	{
        		answer[i]=0;
        		continue;
        	}
        	for(int j=0;j<arr.size();j++) {
        		if(query_arr[2].equals("-"))
        			break;
        		else if(!query_arr[2].equals(info_arr[arr.get(j)][2]))
        			arr.set(j,-1);
        	}
        	arr.removeAll(minus_one);
        	//System.out.println(arr.size()+"size2");
        	
        	if(arr.isEmpty())
        	{
        		answer[i]=0;
        		continue;
        	}
        	for(int j=0;j<arr.size();j++) {
        		if(query_arr[3].equals("-"))
        			break;
        		else if(!query_arr[3].equals(info_arr[arr.get(j)][3]))
        			arr.set(j,-1);
        	}
        	arr.removeAll(minus_one);
        	//System.out.println(arr.size()+"size3");
        	if(arr.isEmpty())
        	{
        		answer[i]=0;
        		continue;
        	}
        	for(int j=0;j<arr.size();j++) {
        		if(query_arr[4].equals("-"))
        			break;
        		else if(!(Integer.parseInt(query_arr[4])<=Integer.parseInt(info_arr[arr.get(j)][4])))
        			arr.set(j,-1);
        	}
        	arr.removeAll(minus_one);
        	//System.out.println(arr.size()+"size4");
        	
        	answer[i]=arr.size();
        	
        }
        return answer;
    }
}
public class SearchRanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
		String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
		Solution3 sol = new Solution3();
		System.out.println(Arrays.toString(sol.solution(info, query)));
	}

}
