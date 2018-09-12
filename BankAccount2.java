import java .util.Scanner;
public class BankAccount{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Bank r=new Bank();
		while(true){
			try
			{
				System.out.print("\nEnter Bank name :");
				r.setBankname(sc.next());
				System.out.print("\nEnter balance :");
				r.setbalance(sc.nextDouble());
				r.currentbalnce();
			}
			catch(IllegalArgumentException e){
				System.out.println(e.getMessage());
			}
		}
	}
}
class Bank{
	private double balance;
	private String bankname;
	public void setbalnce(double balance){
		if((balance<1000)||(balance>5000)){
			throw new IllegalArgumentExeption(Bankname+" u r not allow for opening account,balance should be in 1000"+"to 5000 to opening account");
		}
		this.balance=balance;
	}
	public void setBankname(String Bankname){
		this.bankname=bankname;
	}
	public String getBankname(){
		return bankname;
	}
	public  double getBalance(){
		return balance;
	}
	public void currentbalance(){
		if(balance>=1000){
			System.out.println(name+"u r allow for opening account According to Bank rule and regulation"+"Eligbile after conform");
		}
	}
}