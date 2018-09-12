import java.util.*;
class ArrayAd{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.printf("Enter number you want to perform operation:");
		int n=scn.nextInt();
		int[] ia=new int[n];
		for(int i=0;i<ia.length; i++){
			System.out.print("Enter value of   "+ (i+1)+" is:");
			ia[i]=scn.nextInt();
			//int[] ia=new int[scn.nextInt()];
		}
		int[] res=Ab.addsub(ia);
		System.out.println("Addition Result    : " +res[0] );
		System.out.println("Substraction Result   : " +res[1] );
	}
}
class Ab{
	static  int[]   addsub(int[] ia){
		//Addition of numbers
		int add=ia[0];
		int sub=ia[0];
		for(int i=1;i<ia.length;  i++){
			add=add+ia[i];
		}

			//Substraction of numbers
			for(int  i=1;i<ia.length;  i++)  {
				sub=sub-ia[i];
			}
			int [] ib={add,sub};
			return ib;
		}
	}

