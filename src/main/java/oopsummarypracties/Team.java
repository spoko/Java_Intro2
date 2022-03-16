package oopsummarypracties;

import java.util.LinkedList;
import java.util.List;

public class Team {
    private String name;
    private int rating;
    public LinkedList<Player> playerList = new LinkedList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public Team(String name){
        setName(name);
    }

    public void addPlayerToTheTeam(Player player){
        playerList.add(player);
        calculateCurrentRating();
    }

    public void removePlayerFromTheTeam(Player player){
        if (playerList.contains(player)){
            playerList.remove(player);
            calculateCurrentRating();
        }else{
            System.out.println("No such player!");
        }
    }

    //internal setter of the rating
    private void calculateCurrentRating(){
        int result = 0;

        for (Player player : playerList){
            result += player.getOverallSkills();
        }
        rating = result / playerList.size();
    }

}
