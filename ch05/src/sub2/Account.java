package sub2;

public class Account {

	//속성
	private String bank;
	private String acc;
	private String name;
	private int balance;
	
	//생성자
	public Account ( String bank, String acc, String name, int balance) {
		this.bank = bank;
		this.acc = acc;
		this.name = name;
		this.balance = balance;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getBank() {
		return bank;
	}
	
	
	//기능
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
			this.balance -= money;
		}
	
	public void show() {
		System.out.println("--------------------");
		System.out.println("은행명: "+ bank);
		System.out.println("계좌번호: "+ acc);
		System.out.println("입금주: "+ name);
		System.out.println("현재잔액: "+ balance);
	}
	
}
