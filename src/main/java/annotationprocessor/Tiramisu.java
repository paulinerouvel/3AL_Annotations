package annotationprocessor;
import jdk.nashorn.internal.objects.annotations.*;

@Documentation.Factory(
        id = "Tiramisu",
        type = Meal.class
)
public class Tiramisu implements Meal {

    public float getPrice() {
        return 4.5f;
    }
}

