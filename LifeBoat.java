import java.util.Arrays;

class Solution7 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
       
        Arrays.sort(people);
        
        int i=0;
        int j=people.length-1;
        while(true){
        	if(people[i]+people[j]<=limit) {
        		answer++;
        		i++; j--;
        	}
        	else {
        		answer++;
        		j--;
        	}
        	
        	if(i==j) {
        		answer++;
        		break;
        	}
        	else if(i>j)
        		break;
        }
        
        
        return answer;
    }
}
public class LifeBoat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] people1 = {70, 50, 80, 50};
		int[] people2 = { 70, 80, 50 };
		int limit = 100;
		
		Solution7 sol = new Solution7();
		System.out.println(sol.solution(people1, limit));
		System.out.println(sol.solution(people2, limit));
		
	}

}
