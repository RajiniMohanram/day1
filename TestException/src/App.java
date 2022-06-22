import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter from account number");
		int from = Integer.parseInt(sc.nextLine());
		System.out.println("Enter to account");
		int to = Integer.parseInt(sc.nextLine());
		System.out.println("Enter amount");
		double amount = Double.parseDouble(sc.nextLine());

		handleBankService(from, to, amount);

		System.out.println("End of Main");
	}

	public static void handleBankService(int from, int to, double amount) {
		BankService service = new BankService();
		System.out.println("Main class fund transfer initiated...");
		try {
			service.transfer(from, to, amount);
			System.out.println("Trasnferred amount ...");
		} catch (Exception ex) {
			System.err.println("Transaction failed...");
		}
	}
}
