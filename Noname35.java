class  Example{
	static int a=m1();
	static int m1(){
		System.out.println("Variable 'a' is created");
		return 10;
	}
	static int m2(){
		System.out.println("Vraiable 'b' is created");
		return20;
	}
	public static void main(String[] args){
		System.out.println("main");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
	static int b=m2();
}

