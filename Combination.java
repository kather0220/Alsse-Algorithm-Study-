public class Combination {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3}; //������ ���� �迭 
        boolean[] visited = new boolean[arr.length];
 
        //1. ��Ʈ��ŷ�� �̿��� ����
        System.out.println("-------- 1. ��Ʈ��ŷ ---------");
    
        for(int r = 1; r <= arr.length; r++) {
        	System.out.println("\n" + arr.length + "�� �߿� " + r  + "�� ����");
            comb1(arr, visited, 0, r);
        }
        
        //2. ��͸� �̿��� ����
        System.out.println("\n---------- 2. ��� ----------");
        
        for(int r = 1; r <= arr.length ; r++) {
        	System.out.println("\n" + arr.length + "�� �߿� " + r  + "�� ����");
            comb2(arr, visited, 0, r);
        }
    }
 
    //1. ��Ʈ��ŷ�� �̿��� ����
    static void comb1(int[] arr, boolean[] visited, int start, int r) {
        if(r == 0) {
            print(arr, visited);
            return;
        } else {
            for(int i = start; i < arr.length; i++) {
                visited[i] = true;
                comb1(arr, visited, i + 1, r - 1);
                visited[i] = false;
            }
        }
    }
 
    //2. ��͸� �̿��� ����
    static void comb2(int[] arr, boolean[] visited, int depth, int r) {
        if(r == 0) {
            print(arr, visited);
            return;
        }
        if(depth == arr.length) {
            return;
        } else {
            visited[depth] = true;
            comb2(arr, visited, depth + 1, r - 1);
 
            visited[depth] = false;
            comb2(arr, visited, depth + 1, r);
        }
    }
 
    // �迭 ���
    static void print(int[] arr, boolean[] visited) {
        for(int i = 0; i < arr.length; i++) {
            if(visited[i] == true)
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}