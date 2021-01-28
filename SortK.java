import java.util.*;
//k¹øÂ° ¼ö
class Solution13 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int start, end, find;
        int num=0;
        for(int i=0; i<commands.length;i++)
        {	start = commands[i][0];
        	end = commands[i][1];
        	find = commands[i][2];
        	int []tmp = new int[end-start+1];
        	int k = 0;
        	for(int j=start-1; j<end;j++) {
        		tmp[k]=array[j];
        		k++;
        	}
        	Arrays.sort(tmp);
        	answer[num]=tmp[find-1];
        	num++;
        		
        		
        }
        return answer;
    }
}
public class SortK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		Solution13 sol = new Solution13();
		System.out.println(Arrays.toString(sol.solution(array, commands)));
	}

}
