package bordercontrol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {

            List<Identifiable> idList = new ArrayList<>();

            String entry = bfr.readLine();
            while (!entry.equals("End")) {
                String[] tokens = entry.split("\\s+");

                if(tokens.length == 2) {
                    idList.add(new Robot(tokens[1], tokens[0]));
                } else {
                    idList.add(new Citizen(
                            tokens[0], Integer.parseInt(tokens[1]), tokens[2]));
                }

                entry = bfr.readLine();
            }

            String lastDigitsOfFakeIds = bfr.readLine();

            idList.removeIf(i -> !i.getId().endsWith(lastDigitsOfFakeIds));
            for (Identifiable id : idList) {
                System.out.println(id.getId());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
