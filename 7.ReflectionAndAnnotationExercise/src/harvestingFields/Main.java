package harvestingFields;

import com.sun.source.tree.ModifiersTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.module.ModuleDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {

            var richSoilClazz = RichSoilLand.class;

            String fieldType;
            while (!"HARVEST".equals(fieldType = bfr.readLine())) {
                for (Field field : richSoilClazz.getDeclaredFields()) {
                    if (!Modifier.toString(field.getModifiers()).equals(fieldType) && !fieldType.equals("all")) {
                        continue;
                    }

                    System.out.printf("%s %s %s%n",
                            Modifier.toString(field.getModifiers()),
                            field.getType().getSimpleName(),
                            field.getName());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
