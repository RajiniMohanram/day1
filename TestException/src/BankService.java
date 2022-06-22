
public class BankService {
	private Account accounts[];

	public BankService() {
		accounts = new Account[5];
		accounts[0]=Account.createAccount("1001,John,23000");
		accounts[1]=Account.createAccount("1002,Kevin,8000");
		accounts[2]=Account.createAccount("1003,Marcus,400");
		accounts[3]=Account.createAccount("1004,Thomas,3000");
		accounts[4]=Account.createAccount("1005,Bob,2000");
	}

	public Account findAccount(int accNo) {
		for(Account acc:accounts) {
			if(acc.getAccNo()==accNo) {
				return acc;
			}
		}
		return null;
	}
	public void transfer(int from, int to, double amount) throws Exception {
		Account fromAcc = findAccount(from);
		fromAcc.withdraw(amount);
		Account toAcc = findAccount(to);
		toAcc.deposit(amount);
	}
}
