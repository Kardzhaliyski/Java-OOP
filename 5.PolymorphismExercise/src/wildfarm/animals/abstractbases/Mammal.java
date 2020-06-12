package wildfarm.animals.abstractbases;

import java.text.DecimalFormat;

public abstract class Mammal extends AnimalImpl {
    private String livingRegion;
    protected static final DecimalFormat formatter = new DecimalFormat("#.##");

    public Mammal(String name, String type, Double weight,
                  String livingRegion) {
        super(name, type, weight);
        setLivingRegion(livingRegion);
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    public void setLivingRegion(String livingRegion) {
        if(livingRegion == null || livingRegion.trim().isEmpty()) {
            throw new IllegalArgumentException("Living region cannot be null or empty!");
        }

        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
       return String.format("%s[%s, %s, %s, %d]",
               getAnimalType(),
               getAnimalName(),
               formatter.format(getAnimalWeight()),
               getLivingRegion(),
               getFoodEaten());
    }


}
