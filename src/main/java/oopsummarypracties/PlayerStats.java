package oopsummarypracties;

public class PlayerStats {
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public void setEndurance(int endurance) {
        if (endurance >=0 && endurance <=100){
            this.endurance = endurance;
        }else {
            System.out.println("ERROR: not between 0 and 100");
            throw new ExceptionInInitializerError("Value must be between 0 and 100");
        }
    }

    public void setSprint(int sprint) {
        if (sprint >=0 && sprint <=100){
            this.sprint = sprint;
        }else {
            System.out.println("ERROR: not between 0 and 100");
            throw new ExceptionInInitializerError("Value must be between 0 and 100");
        }
    }

    public void setDribble(int dribble) {
        if (dribble >=0 && dribble <=100){
            this.dribble = dribble;
        }else {
            System.out.println("ERROR: not between 0 and 100");
            throw new ExceptionInInitializerError("Value must be between 0 and 100");
        }
    }

    public void setPassing(int passing) {
        if (passing >=0 && passing <=100){
            this.passing = passing;
        }else {
            System.out.println("ERROR: not between 0 and 100");
            throw new ExceptionInInitializerError("Value must be between 0 and 100");
        }
    }

    public void setShooting(int shooting) {
        if (shooting >=0 && shooting <=100){
            this.shooting = shooting;
        }else {
            System.out.println("ERROR: not between 0 and 100");
            throw new ExceptionInInitializerError("Value must be between 0 and 100");
        }
    }

    public PlayerStats(int endurance, int sprint, int dribble, int passing, int shooting) {
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    public int getOverallSkills(){
        return (dribble + shooting + passing + sprint + endurance) / 5;
    }
}
