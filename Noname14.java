class Employee{
	int eid;
	String ename;
	String company;
	public String toString ;
	{
		return "eid: "+eid+"\n"+
			"ename: "+ename+"\n"+
			"company: "+company+"\n";
	}
	public static void main(String[] args){
		Employee e1=new Employee();
		e1.eid=7279;
		e1.ename="Samarendra";
		e1.company="SwainFamily";
		System.out.println(e1);
	}
}
