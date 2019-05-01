package fr.wastemart.maven.classgen.classes;
import factory_sample.Meal;
import annotation.Factory;

@Factory(
        id = "Margherita",
        type = Meal.class
)
public class MargheritaPizza implements Meal {

    public float getPrice() {
        return 6.0f;
    }
}
