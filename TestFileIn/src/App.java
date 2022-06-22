import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("myfile.txt");
		Scanner sc = new Scanner(is);

		List<Employee> emps = new ArrayList<>();
		
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			emps.add(Employee.createEmployee(line));
		}
		is.close();
		
		System.out.println("=== Employees Data ===");
		Collections.sort(emps);
		
		for(Employee e : emps) {
			System.out.println(e);
		}
	}

}
