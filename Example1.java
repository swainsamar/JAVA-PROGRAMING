class Example{
static int a=m1();
static int m1(){
System.out.println("Variable 'a' is created");
return 10;
}
static int b=m2();
static int m2(){
System.out.println("Variable 'b' is created");
return 20;
}
public static void main(String[] args){
System.out.println("main");
System.out.println("a:"+a);
System.out.println("b:"+b);
}
}
