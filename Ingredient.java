public class Ingredient {
    private String name;
    private double quantity;
    private String unit;
    private double caloriesPerUnit;
    private double carbsPerUnit;
    private double proteinsPerUnit;

    // Constructor
    protected Ingredient() {

    }

    protected Ingredient(String name, double quantity, String unit, double caloriesPerUnit, double carbsPerUnit, double proteinsPerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.caloriesPerUnit = caloriesPerUnit;
        this.carbsPerUnit = carbsPerUnit;
        this.proteinsPerUnit = proteinsPerUnit;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

    public double getCaloriesPerUnit() {
        return caloriesPerUnit;
    }

    public double getCarbsPerUnit() {
        return carbsPerUnit;
    }

    public double getProteinsPerUnit() {
        return proteinsPerUnit;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCaloriesPerUnit(double caloriesPerUnit) {
        this.caloriesPerUnit = caloriesPerUnit;
    }

    public void setCarbsPerUnit(double carbsPerUnit) {
        this.carbsPerUnit = carbsPerUnit;
    }

    public void setProteinsPerUnit(double proteinsPerUnit) {
        this.proteinsPerUnit = proteinsPerUnit;
    }
}
