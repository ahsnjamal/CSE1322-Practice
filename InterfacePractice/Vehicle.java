package InterfacePractice;

interface Vehicle {
	boolean hasEngine = true;
	public void vehicleInfo();
}

class Car implements Vehicle{
	String vehicleInfo;
	int maxSpeed;
	int maxCapacity;
	Car(String carInfo){
		this.vehicleInfo = carInfo;
	}
	@Override
	public void vehicleInfo() {
		System.out.println("This is a " + this.vehicleInfo);
	}
}

class Truck implements Vehicle{
	String vehicleInfo;
	int maxSpeed;
	int maxLoad;
	Truck(String truckInfo){
		this.vehicleInfo = truckInfo;
	}
	@Override
	public void vehicleInfo() {
		System.out.println("This is a " + this.vehicleInfo);
	}
}

class Tester
{
	public static void main(String [] args) {
		Car myCar1 = new Car("2016 Toyota Camry");
		myCar1.vehicleInfo();
		
		Car myCar2 = new Car("2015 Maruti Swift");
		myCar2.vehicleInfo();
		
		Truck myTruck1 = new Truck("2016 Ford F150");
		myTruck1.vehicleInfo();
		
		//Vehicle v1 = new Vehicle("Car"); interfaces can't create objects of interface class
		Vehicle v2 = new Car("2019 Nissan Sentra");
		v2.vehicleInfo();

		
		Car c1 = new Car("2019 Toyota Tacoma");
		c1.vehicleInfo();

		//Car c2 = new Vehicle("2019 Toyota Tacoma"); not all vehicles are cars
		//Car c3 = new Object("2019 Toyota Tacoma"); not all objects are cars
		
		Truck t1 = new Truck("2019 Chevy Silverado");
		t1.vehicleInfo();

		//Truck t2 = new Vehicle("2019 Chevy Silverado"); not all vehicles are trucks
		//Truck t3 = new Object("2019 Chevy Silverado"); not all objects are trucks
		
		Object o1 = new Car("2019 Kia Optima");
		Object o2 = new Truck("2019 Ford Ranger");

		Vehicle v3 = new Truck("Truck");		
		v3.vehicleInfo();
	}
}