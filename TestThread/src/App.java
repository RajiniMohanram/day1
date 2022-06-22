
public class App {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("=== Main Function Begins ===");
		SubTask t1 = new SubTask("John");
		SubTask t2 = new SubTask("Lawrence");
		SubTask t3 = new SubTask("James");
		SubTask t4 = new SubTask("Mathew");
		SubTask t5 = new SubTask("Kevin");
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		t4.start();
		t4.join();
		t5.start();
		t5.join();
		
		System.out.println("=== End of Main ===");
	}

}
