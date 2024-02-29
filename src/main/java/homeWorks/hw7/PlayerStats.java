package homeWorks.hw7;

public class PlayerStats {
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        if (endurance >= 0 && endurance <= 100){
            this.endurance = endurance;
        }else {
            throw new ExceptionInInitializerError("Value must be between 0 and 100.");
        }
    }

    public int getSprint() {
        return sprint;
    }

    public void setSprint(int sprint) {
        if (sprint >= 0 && sprint <= 100){
            this.sprint = sprint;
        }else {
            throw new ExceptionInInitializerError("Value must be between 0 and 100.");
        }
    }

    public int getDribble() {
        return dribble;
    }

    public void setDribble(int dribble) {
        if (dribble >= 0 && dribble <= 100){
            this.dribble = dribble;
        }else {
            throw new ExceptionInInitializerError("Value must be between 0 and 100.");
        }
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        if (passing >= 0 && passing <= 100){
            this.passing = passing;
        }else {
            throw new ExceptionInInitializerError("Value must be between 0 and 100.");
        }
    }

    public int getShooting() {
        return shooting;
    }

    public void setShooting(int shooting) {
        if (shooting >= 0 && shooting <= 100){
            this.shooting = shooting;
        }else {
            throw new ExceptionInInitializerError("Value must be between 0 and 100.");
        }
    }

    public PlayerStats(int endurance, int sprint, int dribble, int passing, int shooting){
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    public int getStats(){
        return (endurance + sprint + dribble + passing + shooting) / 5;
    }
}
