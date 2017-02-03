import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by gorshkov on 23.12.2016.
 */
public class TestReflectionAPI {
    public static void main(String[] args) throws ClassNotFoundException {
        MyClass a = new MyClass("field0 value", "field1 value", "field2 value");
        soutModifiersOfObjectMethods(a);
    }

    private static void soutModifiersOfObjectMethods(MyClass a) {
        Class aClass = a.getClass();
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers)) {
                System.out.println("Method \"" + method.getName() + "\" is Public");
            } else if (Modifier.isPrivate(modifiers)) {
                System.out.println("Method \"" + method.getName() + "\" is Private");
            } else if (Modifier.isProtected(modifiers)) {
                System.out.println("Method \"" + method.getName() + "\" is Protected");
            } else {
                System.out.println("Method \"" + method.getName() + "\" is Package-local");
            }
        }
    }
}
