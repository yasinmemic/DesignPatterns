public class BuilderPatternDemo {
	
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		
		System.out.println("*** VegMeal ***");
		Meal vegMeal = mealBuilder.prepareNonVegMeal();
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());
		
		
		System.out.println("\n\n*** NonVegMeal ***");
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());
	}
}
