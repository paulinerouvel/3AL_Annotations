package fr.wastemart.maven.classgen.classes;
import fr.wastemart.maven.annotationprocess.classgen.annotation.Factory;

@Factory(
        id = "Calzone",
        type = Meal.class
)
public class CalzonePizza implements Meal {

    public float getPrice() {
        return 8.5f;
    }
}
