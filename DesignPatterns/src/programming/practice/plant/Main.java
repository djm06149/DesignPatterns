package programming.practice.plant;

public class Main {

	public static void main(String[] args) {
		Field field = new Field();
		
		Plant plant = field.orderPlant("sunflower");
		System.out.println(plant + "\n");
		
		plant = field.orderPlant("repeater");
		System.out.println(plant + "\n");
		
		plant = field.orderPlant("peashooter");
		System.out.println(plant + "\n");
		
		plant = field.orderPlant("wallnut");
		System.out.println(plant + "\n");
		
		
		plant = field.orderPlant("tallnut");
		System.out.println(plant + "\n");
		
		plant = field.orderPlant("sunshroom");
		System.out.println(plant + "\n");

	}
}
