package footballteamgenerator;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        this.setName(name);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    private void setEndurance(int endurance) {
        validateStatRange("Endurance", endurance);
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        validateStatRange("Sprint", sprint);
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        validateStatRange("Dribble", dribble);
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        validateStatRange("Passing", passing);
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        validateStatRange("Shooting", shooting);
        this.shooting = shooting;
    }

    private void validateStatRange(String statName, int statRating) {
        if(statRating < 0 || statRating > 100) {
            throw new IllegalArgumentException(
                    statName + " should be between 0 and 100.");
        }
    }

    public double overallSkillLevel() {
        return (endurance + sprint + dribble + passing + shooting) / 5.0;
    }
}
