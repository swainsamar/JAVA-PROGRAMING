class A{
}
class B{
static void m1(){
System.out.println("B m1");
}
}
class C{
static void m2(){
System.out.println("C m2");
}
public static void main(String[] args){
System.out.println("C  main");
}
}
class D{
static void  m3(){
System.out.println("D m3");
}
public static void main(String[] args){
System.out.println("D main");
m3();
}
static void m4(){
System.out.println("D m4");
}
}
class E{
static void m5(){
System.out.println("E m5");
}
public static void main(String[] args){
System.out.println("E main");
m5();
B.m1();
C.m2();
D.m3();
D.m4();
D.main(new String[0]);
E.m5();
}
}