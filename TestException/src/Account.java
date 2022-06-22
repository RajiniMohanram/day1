public class Account {
	private int accNo;
	private String name;
	private double balance;
	
	public Account(int accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	
	public Account() {}
	
	public void deposit(double amount) throws Exception{
		if(amount<=0) {
			throw new Exception("Invalid amount");
		}
		
		balance += amount;
	}
	
	public void withdraw(double amount) throws RuntimeException{
		if(balance-amount<100) {
			throw new RuntimeException("Insufficient Amount");
		}
		balance -= amount;
	}
	
	
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static Account createAccount(String line) { // "1001,John Thomas,2300.0"
		String[] v = line.split(","); // "1001" "John Thomas" "2300.0"

		int accNo = Integer.parseInt(v[0]); // "1001"
		String accName = v[1];
		double balance = Double.parseDouble(v[2]); // "2300.0"

		Account acc = new Account(accNo, accName, balance);
		return acc;
	}
}
