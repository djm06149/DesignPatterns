package programming.practice.abstractfactory;

import programming.practice.factory.Pizza;

public class Main {

	public static void main(String[] args) {
		PizzaStore pizzaStore = new FranchiseA();
		Pizza pizza = pizzaStore.orderPizza("veggie");
		Beverage beverage = pizzaStore.orderBeverage("coffee");
		System.out.println(pizza + " �� ����\n");
		System.out.println(beverage + " �� ����\n");
		
		pizzaStore = new FranchiseB();
		pizza = pizzaStore.orderPizza("pepperoni");
		beverage = pizzaStore.orderBeverage("soju");
		System.out.println(pizza + " �� ����\n");
		System.out.println(beverage + " �� ����\n");
	}

}
