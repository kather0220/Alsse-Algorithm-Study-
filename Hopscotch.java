
class Solution9 {
    int solution(int[][] land) {
        int answer = 0;
        
        for(int i=0;i<land.length-1;i++) {
        	land[i+1][0]+=Math.max(Math.max(land[i][1], land[i][2]), land[i][3]);
        	land[i+1][1]+=Math.max(Math.max(land[i][0], land[i][2]), land[i][3]);
        	land[i+1][2]+=Math.max(Math.max(land[i][0], land[i][1]), land[i][3]);
        	land[i+1][3]+=Math.max(Math.max(land[i][0], land[i][1]), land[i][2]);
        }
        
        answer = Math.max(Math.max(land[land.length-1][0], land[land.length-1][1]), Math.max(land[land.length-1][2], land[land.length-1][3]));
       
        return answer;
    }
}
public class Hopscotch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution9 sol = new Solution9();
		int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		System.out.println(sol.solution(land));

	}

}
