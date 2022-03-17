package chap06.book.exercise.p20;

public class Account {
	
	private String ano;  // 계좌번호
	private String owner;// 계좌주
	private int balance; // 금액
	
	// source -> constructor using files 
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner =owner;
		this.balance = balance;		
	}
	
	// source -> getters and setters
	public String getAno() { 
		return ano; 
		}
	public void setAno(String ano) {
		this.ano = ano;
		}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}	
}



