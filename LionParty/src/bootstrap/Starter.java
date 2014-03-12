package bootstrap;

import java.util.List;

import entities.Animal;
import entities.STAXParser;

public class Starter {

	public static void main(String[] args) {
		STAXParser read = new STAXParser();
		List<Animal> readConfig = read.readConfig("lion_party.xml");

		for (int i = 0; i < readConfig.size(); i++) {
			Animal animal = readConfig.get(i);
			String food = animal.getPreferred_food();
			int group = animal.getGroup();
			for (Animal target : readConfig) {
				if (readConfig.indexOf(animal) == readConfig.indexOf(target)) {
					continue;
				}
				if ((target.getName().equals(food)) || (food.equals("Anything"))){
					if (target.getGroup() == group){
					animal.setGroup(++group);
				}
				}
			}
		}
		for (Animal current : readConfig) {
			System.out.println(current.getName() + " in " + current.getGroup()+" group");
		}
	}
}
