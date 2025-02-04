package JavaTask;
class BankAccount{
	private long accountNum;
	private int balance;
	public long getAccNum() {
		return accountNum;
	}
	public int getBal() {
		return balance;
	}
	public void setDetails(long accountNum,int balance) {
		this.accountNum=accountNum;
		this.balance=balance;
	}
}

public class BankEncap {

	public static void main(String[] args) {
		BankAccount b=new BankAccount();
		b.setDetails(123456789, 50000);
		System.out.println("Account Number "+b.getAccNum());
		System.out.println("Balance in your account "+b.getBal());
		

	}

}
