package programming.practice.strategy;

public class MallardDuck extends Duck {
	public MallardDuck() {
		this.quackable = new Quack();
		this.swimable = new SwimWithLegs();
		this.flyable = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("나는 청둥오리~");

	}

}
