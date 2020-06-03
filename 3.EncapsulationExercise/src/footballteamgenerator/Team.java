package footballteamgenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(String playerName) {
        int playerIndex = -1;
        for (int index = 0; index < players.size(); index++) {
            if (players.get(index).getName().equals(playerName)) {
                playerIndex = index;
                break;
            }
        }

        if (playerIndex != -1) {
            players.remove(playerIndex);
        } else {
            throw new IllegalStateException(String.format(
                    "Player %s is not in %s team.",
                    playerName,
                    this.name));
        }
    }

    public double getRating() {
        return players.stream()
                .mapToDouble(Player::overallSkillLevel)
                .average()
                .orElse(0);
    }
}
