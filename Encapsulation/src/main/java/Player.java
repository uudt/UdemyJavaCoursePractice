public class Player {

    public String fullName;
    public int health;
    public String weapon;

    public void looseHealth(int damage) {
        this.health = this.health - damage;
        if (health <= 0) {
            System.out.println("Player knocked out  of game");
        }
    }

    public int healthremaining() {
        return this.health;
    }

    public void restoreHealth(int extraHealth) {
        this.health = this.health + extraHealth;
        if (this.health > 100) {
            System.out.println("Player restored to 100%");
            this.health = 100;
        }
    }

}
