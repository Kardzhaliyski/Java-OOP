package harvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            Class<?> richSoilLand = RichSoilLand.class;
            StringBuilder sb = new StringBuilder();

            var modifierTypeToPrint = "";
            while (!"HARVEST".equals(modifierTypeToPrint = bfr.readLine())) {

                for (Field declaredField : richSoilLand.getDeclaredFields()) {
                    switch (modifierTypeToPrint) {
                        case "private": {
                            if (Modifier.isPrivate(declaredField.getModifiers())) {
                                appendFieldData(sb, declaredField);
                            }
                            break;
                        }
                        case "protected": {
                            if (Modifier.isProtected(declaredField.getModifiers())) {
                                appendFieldData(sb, declaredField);
                            }
                            break;
                        }
                        case "public": {
                            if (Modifier.isPublic(declaredField.getModifiers())) {
                                appendFieldData(sb, declaredField);
                            }
                            break;
                        }
                        case "all": {
                            appendFieldData(sb, declaredField);
                            break;
                        }
                    }
                }
            }

            System.out.println(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void appendFieldData(StringBuilder sb, Field declaredField) {
        if (sb.length() != 0) {
            sb.append(System.lineSeparator());
        }
        sb.append(Modifier.toString(declaredField.getModifiers()));
        sb.append(" ").append(declaredField.getType().getSimpleName());
        sb.append(" ").append(declaredField.getName());
    }
}
