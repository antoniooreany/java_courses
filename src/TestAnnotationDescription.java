import java.lang.annotation.*;

/**
 * Created by gorshkov on 23.12.2016.
 */
public class TestAnnotationDescription {
    @Documented
    @Target(ElementType.METHOD)
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface MethodInfo{
        String author() default "Antonio";
        String date();
        int revision() default 1;
        String comments();
    }
}
