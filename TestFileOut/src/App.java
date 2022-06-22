import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class App {

	public static void main(String[] args) throws IOException{
		
		Writer fo = new FileWriter("myfile.txt");
		PrintWriter fout = new PrintWriter(fo);
		
		Student s1 = new Student(1001, "Kevin", 9.34);
		Student s2 = new Student(1020,"Bob",4.87);
		Student s3 = new Student(1082, "Stuart", 7.23);
		
		
		fout.println(s1);
		fout.println(s2);
		fout.println(s3);
		
		fout.flush();
		fout.close();
		
		System.out.println("=== end of main ===");
	}

}
