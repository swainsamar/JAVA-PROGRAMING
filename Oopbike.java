class Bike{
	String engNum;
	String color;
	String ownerName;
	String bikeNum;
	Bike(String engNum,String color){
		this.engNum=engNum;
		this.color=color;
	}
	void setOwnerName(String ownerName){
		this.ownerName=ownerName;
	}
	void setBikeNum(String bikeNum){
		this.bikeNum=bikeNum;
	}
	void start(){
		System.out.println(ownerName+"strated bike");
	}
	void move(){
		System.out.println(ownerName+"moving on bike");
	}
	void stop(){
		System.out.println(ownerName+"stopped bike");
	}
}


class Factory{
	public static void main(String[] args){
		Bike pulsar=new Bike("ABC123Q","RED");
		Bike bullet=new Bike("EFG99W","YELLOW");
		pulsar.setOwnerName("Hari Krishna");
		pulsar.setBikeNum("TS09BJ9999");
		bullet.setOwnerName("Bala Krishna");
		bullet.setBikeNum("TS07RT1");
		bullet.start();
		bullet.move();
		bullet.stop();
	}
}