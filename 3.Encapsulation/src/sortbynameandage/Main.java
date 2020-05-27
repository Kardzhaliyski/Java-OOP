package sortbynameandage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            int numOfInputs = Integer.parseInt(bfr.readLine());

            List<Person> people = new ArrayList<>();

            for (int i = 0; i < numOfInputs; i++) {
                String[] input = bfr.readLine().split("\\s+");
                people.add(new Person(input[0],
                        input[1],
                        Integer.parseInt(input[2]),
                        Double.parseDouble(input[3])));
            }

//            Collections.sort(people);

            double bonus = Double.parseDouble(bfr.readLine());
            for (Person person : people) {
                person.increaseSalary(bonus);
                System.out.println(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
