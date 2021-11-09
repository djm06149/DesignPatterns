package programming.practice.strategy;

public class DuckFactory2 {
	
	public Duck createDuck(String type) {
		Duck duck = null;
		if(type.equals("MallardDuck")) {
			duck = new MallardDuck();
		} else if(type.equals("RedheadDuck")) {
			duck = new RedheadDuck();
		}
		
		return duck;
	}
	
	public void runDuck(Duck duck) {
		duck.display();
		duck.quack();
		duck.swim();
	}

}
