package fr.wastemart.maven.classgen.classes;
import fr.wastemart.maven.annotationprocess.classgen.annotation.Factory;

@Factory(id = "Margherita", type = Meal.class)

public interface Meal {
    public float getPrice();
}
