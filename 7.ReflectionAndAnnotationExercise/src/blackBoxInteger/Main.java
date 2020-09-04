package blackBoxInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {

            var blackBoxIntClazz = BlackBoxInt.class;

            var blackBoxIntConstructor = blackBoxIntClazz.getDeclaredConstructor();
            blackBoxIntConstructor.setAccessible(true);
            BlackBoxInt blackBox = blackBoxIntConstructor.newInstance();

            Map<String,Method> blackBoxIntMethods = Arrays.stream(blackBoxIntClazz.getDeclaredMethods())
                    .collect(Collectors.toMap(Method::getName, m -> m));
            for (Method value : blackBoxIntMethods.values()) {
                value.setAccessible(true);
            }

            var blackBoxValueField = blackBoxIntClazz.getDeclaredField("innerValue");
            blackBoxValueField.setAccessible(true);

            var commandInput = "";
            while (!"END".equals(commandInput = bfr.readLine())) {
                var tokens = commandInput.split("_");
                var commandName = tokens[0];
                var commandValue = Integer.parseInt(tokens[1]);

                if(blackBoxIntMethods.containsKey(commandName)) {
                    blackBoxIntMethods.get(commandName).invoke(blackBox, commandValue);
                }

                System.out.println(blackBoxValueField.get(blackBox));
            }


        } catch (IOException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
