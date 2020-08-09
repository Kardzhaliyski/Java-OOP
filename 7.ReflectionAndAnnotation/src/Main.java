

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args)  {
        Class<Reflection> reflectionClass = Reflection.class;
//
//        System.out.println(reflectionClass);
//        System.out.println(reflectionClass.getSuperclass());
//        for (Class<?> anInterface : reflectionClass.getInterfaces()) {
//            System.out.println(anInterface);
//        }
//        var reflectionInstance = reflectionClass.getDeclaredConstructor().newInstance();
//        System.out.println(reflectionInstance);
//
//        var reflectionGetters = Arrays.stream(reflectionClass.getDeclaredMethods())
//                .filter(m -> m.getName().startsWith("get"))
//                .filter(m -> m.getParameterCount() == 0)
//                .filter(m -> m.getReturnType() != void.class)
//                .sorted(Comparator.comparing(Method::getName))
//                .toArray(java.lang.reflect.Method[]::new);
//
//        var reflectionSetters = Arrays.stream(reflectionClass.getDeclaredMethods())
//                .filter(m -> m.getName().startsWith("set"))
//                .filter(m -> m.getParameterCount() == 1)
//                .filter(m -> m.getReturnType() == void.class)
//                .sorted(Comparator.comparing(Method::getName))
//                .toArray(Method[]::new);
//
//        for (Method reflectionGetter : reflectionGetters) {
//            System.out.println(String.format("%s will return class %s",
//                    reflectionGetter.getName(), reflectionGetter.getReturnType().getName()));
//        }
//
//        for (Method setter : reflectionSetters) {
//            System.out.println(String.format("%s and will set field of class %s",
//                    setter.getName(), setter.getParameterTypes()[0].getName()));
//        }
//
//        Arrays.stream(reflectionClass.getDeclaredFields())
//                .filter(f -> !Modifier.isPrivate(f.getModifiers()))
//                .sorted(Comparator.comparing(Field::getName))
//                .forEach(f -> System.out.println(f.getName() + " must be private!"));
//
//        Arrays.stream(reflectionClass.getDeclaredMethods())
//                .filter(m -> m.getName().startsWith("get"))
//                .filter(m -> m.getParameterCount() == 0)
//                .filter(m -> m.getReturnType() != void.class)
//                .filter(m -> !Modifier.isPublic(m.getModifiers()))
//                .sorted(Comparator.comparing(Method::getName))
//                .forEach(m -> System.out.println(m.getName() + " have to be public!"));
//
//        Arrays.stream(reflectionClass.getDeclaredMethods())
//                .filter(m -> m.getName().startsWith("set"))
//                .filter(m -> m.getParameterCount() == 1)
//                .filter(m -> m.getReturnType() == void.class)
//                .filter(m -> !Modifier.isPrivate(m.getModifiers()))
//                .sorted(Comparator.comparing(Method::getName))
//                .forEach(m -> System.out.println(m.getName() + " have to be private!"));

//
//        for (Method method : reflectionClass.getDeclaredMethods()) {
//            if(method.getAnnotations().length != 0) {
//                System.out.println(method.getAnnotations()[0]);
//            }
//        }

        Tracker.printMethodsByAuthor(reflectionClass);

    }
}
