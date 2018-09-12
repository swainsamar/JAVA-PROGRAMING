import java.util.*;
class Student{
	static int eye=2;
	static int leg=2;
	static int hand=2;
	static int ear=2;
	static String Institute;
	int sno;
	String sname;
	String course;
	double fees;
	static Scanner sc=new Scanner(System.in);
}
static void;
	System.out.println("Enter Institute");
	Student.Institute=scn.nextLine();
}
student(){
	System.out.print("Enter sno:");
	this.sno=scn.nextInt(); scn.nextLine();
	System.out.print("Enter sname:");
	this.sname=scn.nextLine();
	System.out.print("Enter course:");
	this.course=scn.nextLine();
	System.out.print("Enter fees:");
	this.fees=scn.nextDouble(); scn.nextLine();
}

void student(int sno,String sname,String course,double fees)
{
	this.sno=sno;
	this.sname=sname;
	this.course=course;
	this.fees=fees;
}
void display(){
	System.out.println("eye:"+eyes);
	System.out.println("ear:"+ears);
	System.out.println("leg:"+legs);
	System.out.println("hand:"+hand);
	System.out.println("Institute:"+institute);
	System.out.println("sno:"+sno);
	System.out.println("sname:"+sname);
	System.out.println("course:"+course);
	System.out.println("fees:"+fees);
}
}
class college{
	public static void main(String[] args){
		Student s1=new Student();
		System.out.println("s1 object is created by  intializing vlalue from KB");
		Student	 s2=new Student(101,"BK","CJ",1000);
		System.out.println("s2 object is created by intializing values from passed argument");
		System.out.println("s1 object value");
		s1.display();
		System.out.println("s2 object value");
		s2.display();
	}
}
