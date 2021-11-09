package programming.practice.plant;

public class Field {
	public Plant orderPlant(String plantName) {
		Plant plant = SimplePlantFactory.createPlant(plantName);
		
		if(plant == null) {
			return null;
		}
		
		plant.display();
		plant.creation();
		
		
		return plant;
	}

}

