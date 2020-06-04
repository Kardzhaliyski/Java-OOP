package footballteamgenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {

            TeamRepository teamRepository = new TeamRepository();
            String command = bfr.readLine();
            while (!command.equals("END")) {
                try{
                    teamRepository.executeCommand(command);
                } catch (IllegalStateException | IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                command = bfr.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
