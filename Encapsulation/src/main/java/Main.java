public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//
//        player.fullName = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.looseHealth(damage);
//        System.out.println("Remaining health = " + player.healthremaining());
//
//        player.health = 200;
//
//        player.looseHealth(11);
//        System.out.println("Remaining health = " + player.healthremaining());

        EnhancedPlayer u = new EnhancedPlayer("U", 200, "Sword");
        System.out.println("Enhanced Player is " + u.healthremaining());

    }

}
