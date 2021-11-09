package programming.practice.strategy;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		this.quackable = new MuteQuack();
		this.swimable = new FloatOnWater();
		this.flyable = new FlyNoWay();
	}

	@Override
	public void display() {
		System.out.println("나는 가짜오리~");

	}

}
