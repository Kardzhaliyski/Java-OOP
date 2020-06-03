package footballteamgenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            Map<String, Team> teams = new HashMap<>();

            String command = bfr.readLine();
            while (!command.equals("END")) {
                var tokens = command.split(";");

                try {
                    switch (tokens[0]) {
                        case "Team": {
                            teams.putIfAbsent(tokens[1], new Team(tokens[1]));
                            break;
                        }
                        case "Add": {
                            String teamName = tokens[1];

                            Player player = new Player(
                                    tokens[2],
                                    Integer.parseInt(tokens[3]),
                                    Integer.parseInt(tokens[4]),
                                    Integer.parseInt(tokens[5]),
                                    Integer.parseInt(tokens[6]),
                                    Integer.parseInt(tokens[7]));

                            if (teams.containsKey(teamName)) {
                                teams.get(teamName).addPlayer(player);
                            } else {
                                System.out.printf("Team %s does not exist.%n", teamName);
                            }
                            break;
                        }
                        case "Remove": {
                            String teamName = tokens[1];
                            String playerName = tokens[2];
                            if (teams.containsKey(teamName)) {
                                teams.get(teamName).removePlayer(playerName);
                            } else {
                                System.out.printf("Team %s does not exist.%n", teamName);
                            }
                            break;
                        }
                        case "Rating": {
                            String teamName = tokens[1];
                            if (teams.containsKey(teamName)) {
                                System.out.printf("%s - %d",
                                        teamName,
                                        Math.round(teams.get(teamName).getRating()));
                            } else {
                                System.out.printf("Team %s does not exist.%n", teamName);
                            }
                            break;
                        }
                    }
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
