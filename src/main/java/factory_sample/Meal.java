package factory_sample;
import factory_sample.Meal;
import annotation.Factory;

@Factory(id = "Margherita", type = Meal.class)

public interface Meal {
    public float getPrice();
}
