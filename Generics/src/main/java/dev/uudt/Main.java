package dev.uudt;

record BaseballPlayer(String Player, String position) {}

public class Main {

    public static void main(String[] args) {

        BaseballTeam phillies = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros = new BaseballTeam("Houston Astros");
        scoreResult(phillies, 3, astros, 5);

        Team<BaseballPlayer> philliesT = new Team<>("Philadelphia Phillies");
        Team<BaseballPlayer> astrosT = new Team<>("Houston Astros");
        scoreResult(philliesT, 3, astrosT, 5);

        var harper = new BaseballPlayer("Harper", "Right Fielder");
        var marsh = new BaseballPlayer("Marsh", "Right Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        phillies.listTeamMembers();

    }


    public static void scoreResult(BaseballTeam team1, int t1Score,
                                   BaseballTeam team2, int t2Score) {
        String message = team1.setScore(t1Score, t2Score);
        team2.setScore(t2Score, t1Score);
        System.out.printf("%s, %s %s %n", team1, message, team2);
    }

    public static void scoreResult(Team team1, int t1Score,
                                   Team team2, int t2Score) {
        String message = team1.setScore(t1Score, t2Score);
        team2.setScore(t2Score, t1Score);
        System.out.printf("%s, %s %s %n", team1, message, team2);
    }

}
