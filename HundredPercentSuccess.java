import java.io.*;

public class HundredPercentSuccess {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
		String name = reader.readLine();
		String college = reader.readLine();
		String major = reader.readLine();
		
		
		System.out.println("����� ���� ������ ��帮�ڽ��ϴ�.");
		if(major.equals("�İ�"))
			writer.write("����� ������ �����Դϴ�.");
	}	

}
