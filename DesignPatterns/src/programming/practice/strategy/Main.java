package programming.practice.strategy;

public class Main {

	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.quack();
		duck.swim();
		duck.fly();
		duck.display();
		
		System.out.println();
		
		duck = new RedheadDuck();
		duck.quack();
		duck.swim();
		duck.fly();
		duck.display();
		
		System.out.println();
		
		duck = new RubberDuck();
		duck.quack();
		duck.swim();
		duck.fly();
		duck.display();
		
		System.out.println();
		
		duck = new DecoyDuck();
		duck.quack();
		duck.swim();
		duck.fly();
		duck.display();
		
		System.out.println();
		
		duck = new RobotDuck();
		duck.quack();
		duck.swim();
		duck.fly();
		duck.display();
		
//		DuckFactory duckFactory = new DuckFactory();
//		MallardDuck mallardDuck = duckFactory.createMallardDuck();
//		duckFactory.runMallardDuck(mallardDuck);
//		RedheadDuck redheadDuck = duckFactory.createRedheadDuck();
//		duckFactory.runRedheadDuck(redheadDuck);
//		
//		DuckFactory2 duckFactory2 = new DuckFactory2();
//		Duck duck = duckFactory2.createDuck("MallardDuck");
//		duckFactory2.runDuck(duck);
//		duck = duckFactory2.createDuck("RedheadDuck");
//		duckFactory2.runDuck(duck);
	}

}
