
public class SubTask extends Thread{
	private String name;

	public SubTask(String name) {
		this.name = name;
	}
	
	public void run() {
		System.out.println("Hello "+name);
		try {
			sleep(1000);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
