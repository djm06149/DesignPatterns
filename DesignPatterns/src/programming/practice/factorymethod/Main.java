package programming.practice.factorymethod;

import programming.practice.factory.Pizza;

public class Main {

	public static void main(String[] args) {
		//���������� A
		PizzaStore pizzaStore = new FranchiseA();
		Pizza pizza = pizzaStore.orderPizza("cheese");
		System.out.println(pizza+" �� ����\n");
		
		pizza = pizzaStore.orderPizza("pepperoni");
		System.out.println(pizza+" �� ����\n");
		
		pizza = pizzaStore.orderPizza("clam");
		System.out.println(pizza+" �� ����\n");
		
		pizza = pizzaStore.orderPizza("veggie");
		System.out.println(pizza+" �� ����\n");
		
		//���������� B
		pizzaStore = new FranchiseB();
		pizza = pizzaStore.orderPizza("cheese");
		System.out.println(pizza+" �� ����\n");
		
		pizza = pizzaStore.orderPizza("pepperoni");
		System.out.println(pizza+" �� ����\n");
		
		pizza = pizzaStore.orderPizza("clam");
		System.out.println(pizza+" �� ����\n");
		
		pizza = pizzaStore.orderPizza("veggie");
		System.out.println(pizza+" �� ����\n");

	}

}
