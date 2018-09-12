import java.util.Scanner;

public class loginValidation {
public static void main(String[] args) {
Scanner sc = null;
sc = new Scanner(System.in);
String usn = null;
String mob = null;
String pswd = null;
while (true) {
System.out.print("Enter username : ");
usn = sc.nextLine();
if (usn.isEmpty()) {
System.out.println("please enter username\n");
continue;
}
break;
}
while (true) {
System.out.print("Enter Password : ");
pswd = sc.nextLine();
if (pswd.isEmpty()) {
System.out.println("please enter password\n");
continue;
}
else{
int len = pswd.length();
if (len < 8 || len > 16) {
System.out.println("password must be between 8 to 16\n");
continue;
}
}
break;
}
while (true) {
System.out.print("Enter Mobile No : ");
mob = sc.nextLine();
if (mob.isEmpty()) {
System.out.println("please enter mobile number\n");
continue;
}
else {
try {
long mon = Long.parseLong(mob);
if (mob.length() != 10) {
System.out.println("Number must be 10 digit\n");
continue;
}
break;

} catch (NumberFormatException nfe) {
System.out.println("Number should contains only digits\n");
continue;
}
}//else
}//while 
System.out.println("\n============================");
System.out.println("\tWelcome "+usn);
}//main
}//class