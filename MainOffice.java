import java.util.*;
import java.sal.*;
class mainOffice{
	public static void main(String[] args)throws SQLException {
		Scanner scn =new Scanner(System.in);
		StudentDao sdao=new StudentDao();
		sdao.openConnection();
		System.out.println("choose option:");
		System.out.println("1 Insert");
		System.out.println("2 Select");
		System.out.println("3 Update");
		System.out.println("4 Delete");
		System.out.println("5 Exit");
		System.out.print("\n Enter option number:");
		int option=scn.nextInt();
		scn.nextLine();
		switch(option){
			case 1:{// insert operation code
				Student s1=new Student();
				System.out.println("Enter Student values");
				System.out.print("sno:");
				s1.sno=scn.nextInt();
				scn.nextLine();
				System.out.print("sname:");
				s1.name=scn.nextLine();
				System.out.print("course");
				s1.course=scn.nextLine();
				System.out.print("fee:");
				s1.fee=scn.nextDouble();
				scn.nextLine();
				System.out.print("email:");
				s1.email=scn.nextLine();
				System.out.print("mobileno:");
				s1.mobileno=scn.nextLong();
				scn.nextLine();
				sdao.insert(s1);
				System.out.println("\n Student values are stored successfully:");
				break;
			} //insert case close
			case 2 : // select operation
         System.out.println("choose one operation");
		System.out.println("1 all Students");
		System.out.println("2 one Student");
		System.out.println("3 course wise Student");
		System.out.println("\n Enter option number");
		option=scn.nextInt();
		scn.nextLine();
		switch(option){ //inner switch for select options
			case 1: { //all student selection
				System.out.println("\n Retriving all rows and displaying");
				Student[] Students=sdao.select();
				for(int i=0;i<students.length;i++){
					Student s=Student[i];
					System.out.println("\nStudent" +(i+1)+  "values are");
					System.out.println("sno:"+s.sno);
					System.out.println("sname:"+s.sname);
					System.out.println("course:"+s.course);
					System.out.println("fee:"+s.fee);
					System.out.println("email:"+s.email);
					System.out.println("mobile:"+s.mobile);
				} // for close
				break;
			} // all student case is close
			case 2:{ // one student selection
				System.out.println("Enter sno");
				int sno=scn.nextInt();
				scn.nextLine();
				System.out.println("Retriving one student value and displaying");
				Student s=sdao.select(sno);
				System.out.println("\n student"+sno+"values are:");
				System.out.println("sno:"+sno);
				System.out.println("sname:"+s.sname);
				System.out.println("course:"+s.course);
				System.out.println("fee:"+s.fee);
				System.out.println("email:"+s.email);
				System.out.println("mobile:"+s.mobile);
				break;
			} // one student
			case 3 : { // course wise selection
				System.out.println("Enter course name:");
				string course =scn.nextLine();
				Student[] Students=sdao.select(course);
				for(int i=0; i<Student.length;i++) {
					student s=Students[i];
					System.out.println("\n Student" +(i+1)+"values are");
					System.out.println("sno:"+s.sno);
					System.out.println("sname:"+s.sname);
					System.out.println("course:"+s.course);
					System.out.println("fee:"+s.fee);
					System.out.println("email:"+s.eamil);
					System.out.println("mobile:"+s.mobile);
				}
				break;
			} 
		}
		}
	}
}