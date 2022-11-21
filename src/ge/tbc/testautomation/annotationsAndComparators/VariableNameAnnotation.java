package ge.tbc.testautomation.annotationsAndComparators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
public @interface VariableNameAnnotation {
    String name() default "Default Value";
}
