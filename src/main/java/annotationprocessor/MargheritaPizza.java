package annotationprocessor;


@Documentation.Factory(
        id = "Margherita",
        type = Meal.class
)
public class MargheritaPizza implements Meal {

    public float getPrice() {
        return 6.0f;
    }
}
