package oopsummarypracties;

public class Test {

    public static void main(String[] args) {

        Team barcelona = new Team("Barcelona");

        PlayerStats messiStats = new PlayerStats(75,85,84,92,67);
        Player messi = new Player("Lionel_Messi", messiStats);

        PlayerStats piqueStats = new PlayerStats(195,82,82,89,68);
        Player pique = new Player("Gerard_Pique", piqueStats);

        System.out.println("Rating with no players is: " + barcelona.getRating());
        barcelona.addPlayerToTheTeam(messi);
        System.out.println("Rating after adding first players is: " + barcelona.getRating());
        barcelona.addPlayerToTheTeam(pique);
        System.out.println("Rating after adding second players is: " + barcelona.getRating());

        barcelona.removePlayerFromTheTeam(pique);
        System.out.println("Rating after removing second players is: " + barcelona.getRating());

        System.out.println(barcelona.getRating());

    }
}
