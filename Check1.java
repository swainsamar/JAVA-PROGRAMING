import java.util.Scanner;
class Evenodd{
static boolean isEven(int num){
if(num%2==0){
return true;
}
else
{
return false;
}
}
}



class verify{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter no:");
int no=sc.nextInt();
boolean even=Evenodd.isEven(no);
if(even){
System.out.println(no+"This is even");
}
else{
System.out.println(no+"This is odd");
}
}
}