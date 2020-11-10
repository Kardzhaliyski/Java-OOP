package teams;

import people.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            var numberOfPeople = Integer.parseInt(bfr.readLine());

            Team team = new Team("Team A");

            for (int i = 0; i < numberOfPeople; i++) {
                var personData = bfr.readLine().split("\\s+");
                var firstName = personData[0];
                var lastName = personData[1];
                var age = Integer.parseInt(personData[2]);
                var salary = Double.parseDouble(personData[3]);

                var person = new Person(firstName, lastName, age, salary);

                team.addPlayer(person);
            }

            System.out.println("First team have " + team.getFirstTeam().size() + " players");
            System.out.println("Reserve team have " + team.getReserveTeam().size() + " players");



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
