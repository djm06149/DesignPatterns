package programming.practice.strategy;

public class RedheadDuck extends Duck {
	public RedheadDuck() {
		this.quackable = new Quack();
		this.swimable = new SwimWithLegs();
		this.flyable = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("³ª´Â ¾Æ¸Þ¸®Ä«ÈòÁ×Áö~");
	}

}
