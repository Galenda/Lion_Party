package entities;

public class Animal {
	private String name;
	private String preferred_food;
	private int group=0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPreferred_food() {
		return preferred_food;
	}

	public void setPreferred_food(String preferred_food) {
		this.preferred_food = preferred_food;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}	
}
