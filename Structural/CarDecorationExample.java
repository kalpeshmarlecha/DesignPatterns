
interface Car{
	public void assemble();
}

class CarDecorator implements Car{
	private Car car;

	public CarDecorator(Car c) {
		car = c;
	}
	
	@Override
	public void assemble() {
		car.assemble();
		//System.out.println("Assembling through Car Decorator");
	}
}

class BasicCar implements Car{
	@Override
	public void assemble() {
		System.out.println("Basic Car");
	}
}

class SportsCar extends CarDecorator{

	public SportsCar(Car c) {
		super(c);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("--Sports Car");
	}
}

class LuxuryCar extends CarDecorator{

	public LuxuryCar(Car c) {
		super(c);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("--Luxury Car");
	}
}

public class CarDecorationExample {

	public static void main(String[] args) {

		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n*****");
		
		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
		
	}

}

