import java .util.*;
class Clerk{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		BankAccount acc1=new BankAccount();
		while(true){
			System.out.print("Enter Amount :  ");
			acc1.setBalance(sc.nextDouble());
			System.out.println("Balance is "+acc1.getBalance());
		}
	}
}
	class BankAccount{
		private double balance;
		public void setBalance(double balnce){
			if(balance<=0){
				throw new IllegalArgumentException("can't pass -ve number");
			}
			this.balance=balance;
		}
		public double getBalance(){
			return balance;
		}
	}