import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee implements Comparable<Employee>{
	private int empId;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private Date doj;
	private String role;
	private double salary;
	private double commission;
	private int manager;
	private int deptId;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yy");

	public Employee(int empId, String firstName, String lastName, String email, String phone, Date doj, String role,
			double salary, double commission, int manager, int deptId) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.doj = doj;
		this.role = role;
		this.salary = salary;
		this.commission = commission;
		this.manager = manager;
		this.deptId = deptId;
	}

	public String toString() {
		return String.format("%-3d %-10s %-10s %-10s %-15s %-15s %.2f", 
				empId, firstName, lastName, email, phone, role,salary);
	}

	public static Employee createEmployee(String line) throws Exception {
		String v[] = line.split(",");

		int empId = Integer.parseInt(v[0].trim());
		String firstName = v[1].trim();
		String lastName = v[2].trim();
		String email = v[3].trim();
		String phone = v[4].trim();
		Date doj = sdf.parse(v[5].trim());
		String role = v[6].trim();
		double salary = Double.parseDouble(v[7].trim());
		double commission = Double.parseDouble(v[8].trim());
		int manager = Integer.parseInt(v[9].trim());
		int deptId = Integer.parseInt(v[10].trim());

		return new Employee(empId, firstName, lastName, email, phone, doj, role, salary, commission, manager, deptId);
	}

	@Override
	public int compareTo(Employee o) {
		if(salary > o.salary) {
			return 1;
		}else if(salary < o.salary) {
			return -1;
		}else {
			return 0;
		}
	}
}
