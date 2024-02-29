package homeWorks.hw7;

import java.util.LinkedList;

public class Team {
    private String name;
    private int rating;
    private LinkedList<Player> playerList = new LinkedList<Player>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
        }else {
            //Todo add exception here
        }
    }

    public int getRating() {
        return rating;
    }

    public Team(String name){
        setName(name);
    }

    public void addPlayerToTheTeam(Player playerToBeAdded){
        playerList.add(playerToBeAdded);
        calculateTeamRating();
    }

    public void removePlayerFromTheTeam(Player playerTobeRemoved){
        if (playerList.contains(playerTobeRemoved)){
            playerList.remove(playerTobeRemoved);
            calculateTeamRating();
        }
    }

    private void calculateTeamRating(){
        int tempRating = 0;

        for (Player player : playerList){
            tempRating += player.getOverallSkill();
        }

        this.rating = tempRating / playerList.size();
    }
}
