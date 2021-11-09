package programming.practice.strategy;

import programming.practice.strategy.behavior.Flyable;

public class FlyWithWings implements Flyable {

	@Override
	public void fly() {
		System.out.println("날라다니는 중...");

	}

}
