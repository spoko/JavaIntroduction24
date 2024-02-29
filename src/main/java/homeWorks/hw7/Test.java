package homeWorks.hw7;

public class Test {
    public static void main(String[] args) {
        Team barcelona = new Team("barcelona");

        PlayerStats messiStats = new PlayerStats(75, 85, 84, 92, 67);
        Player messi = new Player("Lionel_Messi", messiStats);

        barcelona.addPlayerToTheTeam(messi);

        PlayerStats piqueStats = new PlayerStats(95, 82, 82, 89, 68);
        Player pique = new Player("Gerard_Pique", piqueStats);

        barcelona.addPlayerToTheTeam(pique);
        barcelona.removePlayerFromTheTeam(pique);

        System.out.println(barcelona.getRating());
    }
}
