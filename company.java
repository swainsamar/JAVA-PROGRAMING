class Employee{
   int Eno;
   String Ename;
   double sal;
   String dept;
   }
class Company{
	public static void main(String[] args){
		Employee e1=new Employee();
		  e1.Eno=101;
		  e1.Ename="samar";
		  e1.sal=100000;
		  e1.dept="clerk";
		System.out.println("Details of 1st Employee");
		System.out.println("Eno:"+e1.Eno);
        System.out.println("Ename:"+e1.Ename);
        System.out.println("sal:"+e1.sal);
        System.out.println("dept:"+e1.dept);
		System.out.println(" ");
		Employee e2=new Employee();
		  e2.Eno=102;
		  e2.Ename="swain";
		  e2.sal=1000000;
		  e2.dept="manager";
        System.out.println("Details of 2nd Employee");
		System.out.println("Eno:"+e2.Eno);
        System.out.println("Ename:"+e2.Ename);
        System.out.println("sal:"+e2.sal);
        System.out.println("dept:"+e2.dept);
        System.out.println("");

	}
}
}