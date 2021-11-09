package programming.practice.decorator;

public class DarkRoast extends Beverage {
	
	public DarkRoast() {
		this.description = "��ũ�ν�Ʈ";
	}

	@Override
	public double cost() {
		return super.cost() + 2.5;
	}

}
