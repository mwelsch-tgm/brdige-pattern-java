public class Calzone extends Pizza {

	private int persons;

	public Calzone(int persons, Ingredients ingredients) {
		this.persons = persons;
		this.ingredients = ingredients;
	}

	public String bake() {

		return "A folded pizza for "+persons+" persons. Taste: "+ingredients.taste();
	}

}
