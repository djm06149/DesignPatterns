package programming.practice.strategy;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		this.quackable = new Squeak();
		this.swimable = new FloatOnWater();
		this.flyable = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("나는 고무오리~");
	}

}
