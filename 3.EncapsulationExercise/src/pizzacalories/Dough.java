package pizzacalories;


public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setFlourType(String flourType) {
        try {
            FlourType.valueOf(flourType.toUpperCase());
            this.flourType = flourType;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    public String getFlourType() {
        return flourType;
    }

    public String getBakingTechnique() {
        return bakingTechnique;
    }

    public double getWeight() {
        return weight;
    }

    private void setBakingTechnique(String bakingTechnique) {
        try {
            BakingTechnique.valueOf(bakingTechnique.toUpperCase());
            this.bakingTechnique = bakingTechnique;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException(
                    "Dough weight should be in the range [1..200].");
        }

        this.weight = weight;
    }

    public double calculateCalories() {
        return this.weight
                * 2
                * FlourType.valueOf(this.flourType.toUpperCase()).getModifier()
                * BakingTechnique.valueOf(this.bakingTechnique.toUpperCase()).getModifier();
    }
}
