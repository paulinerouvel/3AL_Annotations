package factory_sample;
import factory_sample.Meal;
import annotation.Factory;

@Factory(
        id = "Tiramisu",
        type = Meal.class
)
public class Tiramisu implements Meal {

    public float getPrice() {
        return 4.5f;
    }
}

