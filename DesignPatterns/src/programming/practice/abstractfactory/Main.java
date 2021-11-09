package programming.practice.abstractfactory;

import programming.practice.factory.Pizza;

public class Main {

	public static void main(String[] args) {
		PizzaStore pizzaStore = new FranchiseA();
		Pizza pizza = pizzaStore.orderPizza("veggie");
		Beverage beverage = pizzaStore.orderBeverage("coffee");
		System.out.println(pizza + " °í°´ Àü´Þ\n");
		System.out.println(beverage + " °í°´ Àü´Þ\n");
		
		pizzaStore = new FranchiseB();
		pizza = pizzaStore.orderPizza("pepperoni");
		beverage = pizzaStore.orderBeverage("soju");
		System.out.println(pizza + " °í°´ Àü´Þ\n");
		System.out.println(beverage + " °í°´ Àü´Þ\n");
	}

}
