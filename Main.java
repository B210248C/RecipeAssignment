public class Main {
    public static void main(String[] args) {
        // Create the first recipe
        System.out.println();
        Recipe recipe1 = new Recipe("Pasta", "Delicious homemade pasta");

        // Add ingredients with specific nutritional values to recipe1
        Ingredient flour = new Ingredient("Flour", 200, "grams", 3.6, 0.76, 0.1);
        Ingredient eggs = new Ingredient("Eggs", 2, "pieces", 155, 1.1, 13);
        Ingredient salt = new Ingredient("Salt", 1, "teaspoon", 0, 0, 0);

        recipe1.addIngredient(flour);
        recipe1.addIngredient(eggs);
        recipe1.addIngredient(salt);

        // Print recipe1 details before removing an ingredient
        System.out.println("Recipe1 Details Before Removing an Ingredient:");
        recipe1.printRecipeDetails();

        // Calculate and print nutritional information for recipe1
        System.out.println("Total Calories: " + recipe1.calculateCalories());
        System.out.println("Total Carbs: " + recipe1.calculateCarbs());
        System.out.println("Total Proteins: " + recipe1.calculateProteins());

        // Add and print ratings for recipe1
        recipe1.addRating(4);
        recipe1.addRating(5);
        recipe1.addRating(3);

        System.out.println("Average Rating: " + recipe1.getAverageRating());
        System.out.println("Total Ratings: " + recipe1.getTotalRatings());

        // Remove an ingredient from recipe1 and recalculate nutritional info
        recipe1.deleteIngredient(salt);

        // Print recipe1 details after removing an ingredient
        System.out.println("\nRecipe1 Details After Removing an Ingredient:");
        recipe1.printRecipeDetails();

        System.out.println("Total Calories after removing salt: " + recipe1.calculateCalories());
        System.out.println("Total Carbs after removing salt: " + recipe1.calculateCarbs());
        System.out.println("Total Proteins after removing salt: " + recipe1.calculateProteins());

        // Create the second recipe for comparison
        Recipe recipe2 = new Recipe("Salad", "Fresh garden salad");

        // Add ingredients to recipe2
        Ingredient lettuce = new Ingredient("Lettuce", 100, "grams", 0.15, 0.04, 0.01);
        Ingredient tomato = new Ingredient("Tomato", 50, "grams", 0.18, 0.04, 0.01);

        recipe2.addIngredient(lettuce);
        recipe2.addIngredient(tomato);

        // Print recipe2 details
        System.out.println("\nRecipe2 Details:");
        recipe2.printRecipeDetails();

        // Calculate and print nutritional information for recipe2
        System.out.println("Total Calories: " + recipe2.calculateCalories());
        System.out.println("Total Carbs: " + recipe2.calculateCarbs());
        System.out.println("Total Proteins: " + recipe2.calculateProteins());

        System.out.println();
        // Compare recipes by calories
        int comparisonResult = recipe1.compareTo(recipe2);
        if (comparisonResult < 0) {
            System.out.println(recipe1.getName() + " has fewer calories than " + recipe2.getName());
        } else if (comparisonResult > 0) {
            System.out.println(recipe1.getName() + " has more calories than " + recipe2.getName());
        } else {
            System.out.println(recipe1.getName() + " and " + recipe2.getName() + " have the same number of calories.");
        }
    }
}