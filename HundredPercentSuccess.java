import java.io.*;

public class HundredPercentSuccess {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
		String name = reader.readLine();
		String college = reader.readLine();
		String major = reader.readLine();
		
		
		System.out.println("당신을 위한 부적을 써드리겠습니다.");
		if(major.equals("식공"))
			writer.write("당신은 앞으로 전전입니다.");
	}	

}
