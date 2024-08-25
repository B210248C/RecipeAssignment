import java.util.ArrayList;

public class Recipe implements NutritionalInfo, RecipeRating, Comparable<Recipe> {
    private String name;
    private String description;
    private ArrayList<Ingredient> ingredients;
    private ArrayList<Integer> ratings;

    // Constructor
    protected Recipe() {

    }

    protected Recipe(String name, String description) {
        this.name = name;
        this.description = description;
        this.ingredients = new ArrayList<>();
        this.ratings = new ArrayList<>();
    }

    // Adding and deleting ingredients
    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void deleteIngredient(Ingredient ingredient) {
        ingredients.remove(ingredient);
    }

    // NutritionalInfo Interface Methods
    @Override
    public double calculateCalories() {
        double totalCalories = 0.0;
        for (Ingredient ingredient : ingredients) {
            totalCalories += ingredient.getQuantity() * ingredient.getCaloriesPerUnit();
        }
        return totalCalories;
    }

    @Override
    public double calculateCarbs() {
        double totalCarbs = 0.0;
        for (Ingredient ingredient : ingredients) {
            totalCarbs += ingredient.getQuantity() * ingredient.getCarbsPerUnit();
        }
        return totalCarbs;
    }

    @Override
    public double calculateProteins() {
        double totalProteins = 0.0;
        for (Ingredient ingredient : ingredients) {
            totalProteins += ingredient.getQuantity() * ingredient.getProteinsPerUnit();
        }
        return totalProteins;
    }

    // RecipeRating Interface Methods
    @Override
    public void addRating(int rating) {
        ratings.add(rating);
    }

    @Override
    public double getAverageRating() {
        int total = 0;
        for (int rating : ratings) {
            total += rating;
        }
        return ratings.size() > 0 ? (double) total / ratings.size() : 0.0;
    }

    @Override
    public int getTotalRatings() {
        return ratings.size();
    }

    // Comparable Calories of two recipe
    @Override
    public int compareTo(Recipe other) {
        double thisCalories = this.calculateCalories();
        double otherCalories = other.calculateCalories();
        return Double.compare(thisCalories, otherCalories);
    }

    // Method to print recipe details
    public void printRecipeDetails() {
        System.out.println("Recipe Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Ingredients:");
        for (Ingredient ingredient : ingredients) {
            System.out.println("- " + ingredient.getName() + ": " + ingredient.getQuantity() + " " + ingredient.getUnit());
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public ArrayList<Integer> getRatings() {
        return ratings;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void setRatings(ArrayList<Integer> ratings) {
        this.ratings = ratings;
    }
}
