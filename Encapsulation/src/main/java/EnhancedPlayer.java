public class EnhancedPlayer {
    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String fullName) {
        this(fullName, 100, "Sword");
    }

    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;
        if (health <= 0) {
            this.healthPercentage = 1;
        } else if (health > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = health;
        }
        this.weapon = weapon;
    }

    public void looseHealth(int damage) {
        this.healthPercentage = this.healthPercentage - damage;
        if (healthPercentage <= 0) {
            System.out.println("Player knocked out  of game");
        }
    }

    public int healthremaining() {
        return this.healthPercentage;
    }

    public void restoreHealth(int extraHealth) {
        this.healthPercentage = this.healthPercentage + extraHealth;
        if (this.healthPercentage > 100) {
            System.out.println("Player restored to 100%");
            this.healthPercentage = 100;
        }
    }
}
