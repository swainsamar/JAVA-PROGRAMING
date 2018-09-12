import java.util.Scanner;
public class Rider{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Bike r=new Bike();
while(true){
try{
System.out.println("\nChange the gear :");
r.setGear(sc.nextInt());
r.currentGear();
}
catch(IllegalArgumentException e){
System.out.println(e.getMessage());
}
}
}
}
    
 class Bike{
 private int gear;
 public void setGear(int gear) {
 if((gear<0)||(gear>5)){
 throw new IllegalArgumentException("gear should be in 1 to 5 to moving in forward direction");
 }
 this.gear=gear;
 }
 public int getGear(){
 return gear;
 }
 public void currentGear(){
 if(gear==0){
 System.out.println("bike is  nutrel mode");
 }
 else
	 {
 System.out.println("bike is running in gear  :"+gear);
	 }
	 }
 }
 
 
 
