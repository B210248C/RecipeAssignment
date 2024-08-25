public interface RecipeRating {
    void addRating(int rating);       // Method to add a rating for the recipe.
    double getAverageRating();        // Method to calculate and return the average rating.
    int getTotalRatings();            // Method to return the total number of ratings.
}
