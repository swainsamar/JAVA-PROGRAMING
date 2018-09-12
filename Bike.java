class Bike{
	String engNum;
	String color;
	String ownerName;
	String bikeNum;
	Bike(String engNum, String color){
		this.engNum =engNum;
		this.color          =color;
	}
	void setOwnerNmae(String  ownerName){
		this.ownerName=ownerName;
	}
	void setBikeNum(String bikeNum){
		this.bikeNum=bikeNum;
	}
	void start(){
		System.out.println("ownerNmae"+"started bike");
	}
	void move(){
		System.out.println("ownerName"+"moving on bike");
	}
	void stop(){
		System.out.println("ownerName"+"stopped bike");
	}
}



class Factory{
	public static void main(String[] args){
		Bike pulsar     =new Bike("OR29C0381","BLUE");
		Bike bullet       =new Bike("OR29B0371","BLACK");
	    pulsar setOwnerName("SWAIN SAMARENDRA");
		pulsar.setBikeNum("OR29C0381");
        bullet setOwnerName("SAMARENDRA SWAIN");
		bullet.setBikeNum("OR29B0371");
		pulsar.start();
		pulsar.move();
		pulsar.stop();
		bullet.start();
		bullet.move();
		bullet.stop();
	}
}
