package militaryelite;

public enum MissionState {
    INPROGRESS,
    FINISHED;

    public String getLable() {
        if(this.name().equals("INPROGRESS")) {
            return "inProgress";
        } else {
            return "finished";
        }
    }
}
