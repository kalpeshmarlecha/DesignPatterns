abstract class Component {
	public void doJob() {
		System.out.println("From Abstract Component");
	}
}

class ConcreteComponent extends Component {
	@Override
	public void doJob() {
		System.out.println("From Concrete Component");
	}
}

abstract class AbstractDecorator extends Component {
	private Component com;

	public void setComponent(Component component) {
		com = component;
	}

	@Override
	public void doJob() {
		if (com != null) {
			com.doJob();
		}
	}
}

class ConcreteDecorator_1 extends AbstractDecorator {
	public void doJob() {
		super.doJob();
		// Add additional thing if necessary
		System.out.println("--I am explicitly from ConcreteDecorator_1");
	}
}

class ConcreteDecorator_2 extends AbstractDecorator {
	public void doJob() {
		super.doJob();
		// Add additional thing if necessary
		System.out.println("----I am explicitly from ConcreteDecorator_2");
		System.out.println("----LETS DO MORE THINGS HERE");
	}
}

class ConcreteDecorator_3 extends AbstractDecorator {
	public void doJob() {
		super.doJob();
		// Add additional thing if necessary
		System.out.println("------I am explicitly from ConcreteDecorator_2");
		System.out.println("------LETS DO MORE THINGS HERE");
	}
}

public class Decorator {

	public static void main(String[] args) {

		System.out.println("***Decorator pattern Demo***");
		ConcreteComponent cc = new ConcreteComponent();

		ConcreteDecorator_1 cd_1 = new ConcreteDecorator_1();
		// Decorating ConcreteComponent Object //cc with ConcreteDecoratorEx_1
		cd_1.setComponent(cc);
		cd_1.doJob();

		ConcreteDecorator_2 cd_2 = new ConcreteDecorator_2();
		// Decorating ConcreteComponent Object //cc with ConcreteDecoratorEx_1 &
		// //ConcreteDecoratorEX_2
		cd_2.setComponent(cd_1);// Adding //results from cd_1 now
		cd_2.doJob();

		ConcreteDecorator_3 cd_3 = new ConcreteDecorator_3();
		// Decorating ConcreteComponent Object //cc with ConcreteDecoratorEx_1 &
		// //ConcreteDecoratorEX_2
		cd_3.setComponent(cd_2);// Adding //results from cd_1 now
		cd_3.doJob();

	}

}

