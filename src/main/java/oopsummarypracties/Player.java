package oopsummarypracties;

public class Player {
    private String name;
    private PlayerStats stats;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.trim().isEmpty()){
            this.name = name;
        }else {
            System.out.println("ERROR: name cannot be empty");
        }
    }

    public int getOverallSkills(){
        return stats.getOverallSkills();
    }

    public void setStats(PlayerStats stats) {
        if (!stats.equals(null)){
            this.stats = stats;
        }else {
            System.out.println("ERROR: null value for stats");
        }

    }

    public Player(String name, PlayerStats stats){
        setName(name);
        setStats(stats);
    }
}
