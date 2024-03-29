package person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            String name = bfr.readLine();
            int age = Integer.parseInt(bfr.readLine());

            Child child = new Child(name, age);

            System.out.println(child.getName());
            System.out.println(child.getAge());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
