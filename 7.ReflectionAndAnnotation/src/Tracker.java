import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Tracker {

    @Author(name = "Stoicho")
    public static void printMethodsByAuthor(Class<?> clazz) {
        for (Method method : clazz.getDeclaredMethods()) {
            for (Annotation annotation : method.getAnnotations()) {
                if(annotation.annotationType().equals(Author.class)) {
                    Author author = (Author) annotation;
                    System.out.println(author.name() + ": " + method.getName() + "()");
                }
            }
        }
    }
}
