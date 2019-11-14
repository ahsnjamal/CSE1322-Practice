package T3ParameterPassing;

public class Dog {
	public int weight;

	static void B(Dog x) {
		x.weight +=9;
		System.out.println(x.weight);
	}
	
	public static void main(String [] args) {
		Dog myDog = new Dog();
		myDog.weight = 10;
		System.out.println(myDog.weight);// weight is 10
		B(myDog); // weight is changed from 10 to 19 via B method.
		System.out.println(myDog.weight); //weight is printed as 19 after changes took place.
	}
}

