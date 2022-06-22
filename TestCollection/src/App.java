import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		Map<Integer, Account> accounts = new HashMap<Integer, Account>();

		accounts.put(1001, Account.createAccount("1001,Thomas,2300"));
		accounts.put(1032, Account.createAccount("1032,Kevin,300"));
		accounts.put(2081, Account.createAccount("2081,Marcus,8300"));

		if (accounts.containsKey(1032)) {
			Account acc = accounts.get(1032);
		}else {
			System.out.println("No account found");
		}
	}

}
