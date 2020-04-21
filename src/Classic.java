public class Classic extends Pizza {

	private int radius;

	public Classic(int radius, Ingredients ingredients) {
		this.radius = radius;
		this.ingredients = ingredients;
	}

	public String bake() {

		return "A pizza with the size of: "+radius+" and: " + ingredients.taste();
	}

}
