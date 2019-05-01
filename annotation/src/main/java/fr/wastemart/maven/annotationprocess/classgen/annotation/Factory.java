package fr.wastemart.maven.annotationprocess.classgen.annotation;
import java.lang.annotation.*;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface Factory {
     /**
     * The name of the factory
     */
    Class type();
     /**
     * The identifier for determining which item should be instantiated
     */
    String id();
}

