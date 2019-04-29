package annotationprocessor;
import java.io.IOException;

public class PizzaStore {


    public Meal order(String mealName) {
        return Factory.create(mealName);
    }

    public static void main(String[] args) throws IOException {
        PizzaStore pizzaStore = new PizzaStore();
        Meal meal = pizzaStore.order(readConsole());
        System.out.println("Bill: $" + meal.getPrice());
    }
}