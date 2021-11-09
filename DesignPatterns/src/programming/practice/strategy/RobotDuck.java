package programming.practice.strategy;

public class RobotDuck extends Duck {
	public RobotDuck() {
		this.quackable = new Quack();
		this.swimable = new SwimWithLegs();
		this.flyable = new FlyNoWay();
	}

		@Override
		public void display() {
			System.out.println("나는 로봇오리~");
		}
	}


