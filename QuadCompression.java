import java.util.Arrays;

class Solution4 {
	
	static int zero=0;
    static int one=0;
    static int[][] save_arr;
    
    public int[] solution(int[][] arr) {
        
        save_arr=arr;
       
        compress(0,save_arr.length,0,save_arr[0].length);
        
        int[] answer = {zero, one};
        
        return answer;
    }
    
    private static void compress(int a, int b, int c, int d) {
    	int count = 0;
    	for(int i=a;i<b;i++) {
    		for(int j=c;j<d;j++) {
    			if(save_arr[i][j]==0) count++;
    		}
    	}
    	
    	if(count==(b-a)*(d-c)) {
    		zero++;
    		return;
    	}
    	else if(count==0) {
    		one++;
    		return;
    	}
    	
    	else {
    		
    		compress(a,(a+b)/2,c,(c+d)/2);
    		compress(a,(a+b)/2,(c+d)/2,d);
    		compress((a+b)/2,b,c,(c+d)/2);
    		compress((a+b)/2,b,(c+d)/2,d);
    		
    	}
    }
    
}
public class QuadCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution4 sol = new Solution4();
		int[][] arr = {{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}};
		System.out.println(Arrays.toString(sol.solution(arr)));
	}

}
