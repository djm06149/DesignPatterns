package programming.practice.strategy;

import programming.practice.strategy.behavior.Quackable;

public class Squeak implements Quackable {
	
	@Override
	public void quack() {
		System.out.println("»à!»à!");
	}
}
