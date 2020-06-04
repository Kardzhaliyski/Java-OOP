package footballteamgenerator;

import java.util.HashMap;
import java.util.Map;

public class TeamRepository {
    Map<String, Team> teams;

    public TeamRepository() {
        teams = new HashMap<>();
    }


    public void executeCommand(String command) {
        var tokens = command.split(";");

        try {
            switch (tokens[0]) {
                case "Team": {
                    addNewTeam(tokens[1]);
                    break;
                }
                case "Add": {
                    //"Add;<TeamName>;<PlayerName>;<Endurance>;<Sprint>;<Dribble>;<Passing>;<Shooting>"
                    String teamName = tokens[1];
                    String playerName = tokens[2];
                    int endurance = Integer.parseInt(tokens[3]);
                    int sprint = Integer.parseInt(tokens[4]);
                    int dribble = Integer.parseInt(tokens[5]);
                    int passing = Integer.parseInt(tokens[6]);
                    int shooting = Integer.parseInt(tokens[7]);
                    addNewPlayerToTeam(teamName, playerName, endurance, sprint, dribble, passing, shooting);
                    break;
                }
                case "Remove": {
                    removePlayerFromTeam(tokens[1],tokens[2]);
                    break;
                }
                case "Rating": {
                    printTeamRating(tokens[1]);
                    break;
                }
            }
        } catch (IllegalStateException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private void printTeamRating(String teamName) {
        if (teams.containsKey(teamName)) {
            System.out.printf("%s - %d%n",
                    teamName, Math.round(teams.get(teamName).getRating()));
        } else {
            throw new IllegalStateException(String.format("Team %s does not exist.", teamName));
        }
    }

    private void removePlayerFromTeam(String teamName, String playerName) {
        if (!teams.containsKey(teamName)) {
            throw new IllegalStateException(String.format("Team %s does not exist.", teamName));
        }

        teams.get(teamName).removePlayer(playerName);

    }

    private void addNewPlayerToTeam(String teamName,
                                    String playerName,
                                    int endurance,
                                    int sprint,
                                    int dribble,
                                    int passing,
                                    int shooting) {

        if (!teams.containsKey(teamName)) {
            throw new IllegalStateException(
                    String.format("Team %s does not exist.", teamName));
        }

        Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);

        teams.get(teamName).addPlayer(player);
    }

    private void addNewTeam(String teamName) {
        teams.putIfAbsent(teamName, new Team(teamName));
    }
}
