import java.util.Scanner;
class armstrong{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any integer");
		int n=sc.nextInt();
		int dup=n;
		int res=check_arms.arms(n);
		if(dup==res)
			System.out.println("It is an Armstrong no");
		else
			System.out.println("It is not an Armstrong no");
	}
}

class check_arms{
	static int arms(int a){
		int d,r=0;
		while(a>0){
			d=a%10;
			a=a/10;
			r=r+d*d*d;
		}
		return r;
}
}
