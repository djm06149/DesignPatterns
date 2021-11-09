package programming.practice.strategy;

import programming.practice.strategy.behavior.Swimable;

public class SwimWithLegs implements Swimable {

	@Override
	public void swim() {
		System.out.println("수영하는 중...");

	}

}
