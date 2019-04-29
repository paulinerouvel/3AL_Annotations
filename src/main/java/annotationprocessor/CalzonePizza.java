package annotationprocessor;


@Documentation.Factory(
        id = "Calzone",
        type = Meal.class
)
public class CalzonePizza implements Meal {

    public float getPrice() {
        return 8.5f;
    }
}
