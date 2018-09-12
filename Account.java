class Account{
	String Accname;
	long Accnum;
	String Address;
    double Balance;
    }
class Bank{
	public static void main(String[] args){
		System.out.println("Createing 2 Accounts Holder objects");
		System.out.println("");
		Account A1=new Account();
		  A1.Accname="SAMAR";
		  A1.Accnum=320540615;
		  A1.Address="Hyderabad";
		  A1.Balance=10000000.47;
		Account A2=new Account();
		  A2.Accname="SWAIN";
		  A2.Accnum=320540615;
		  A2.Address="Chennai";
		  A2.Balance=999999999.99;
		System.out.println("1st Account Holder values");
		   System.out.println("Name:"+A1.Accname);
           System.out.println("Acc.No:"+A1.Accnum);
		   System.out.println("Address:"+A1.Address);
		   System.out.println("Balance:"+A1.Balance);
		System.out.println("");
		System.out.println("2nd Account Holder values");
		   System.out.println("Name:"+A2.Accname);
           System.out.println("Acc.No:"+A2.Accnum);
		   System.out.println("Address:"+A2.Address);
		   System.out.println("Balance:"+A2.Balance);
	}
}



