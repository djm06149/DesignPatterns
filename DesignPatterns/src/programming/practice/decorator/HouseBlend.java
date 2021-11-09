package programming.practice.decorator;

public class HouseBlend extends Beverage {
	
	public HouseBlend() {
		this.description = "�Ͽ콺������";
	}

	@Override
	public double cost() {
		return super.cost() + 2.0;
	}

}
