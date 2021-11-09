package programming.practice.strategy;

import programming.practice.strategy.behavior.Quackable;

public class Quack implements Quackable {
	
	@Override
	public void quack() {
		System.out.println("Ва!Ва!");
	}
	
}
