package homeWorks.hw7;

public class Player {
    private String name;
    private PlayerStats stats;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            //Todo exception
        }
    }

    public int getOverallSkill() {
        return stats.getStats();
    }

    public void setStats(PlayerStats stats) {
        if (!stats.equals(null)){
            this.stats = stats;
        }else {
            //Todo exception
        }
    }

    public Player(String name, PlayerStats stats){
        setName(name);
        setStats(stats);
    }
}
