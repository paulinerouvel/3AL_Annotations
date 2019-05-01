package fr.wastemart.maven.classgen.classes;
import factory_sample.Meal;
import annotation.Factory;

@Factory(
        id = "Calzone",
        type = Meal.class
)
public class CalzonePizza implements Meal {

    public float getPrice() {
        return 8.5f;
    }
}
