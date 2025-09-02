package oops.with_encapsulation;

public class EnhancedPlayer {
    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String fullName) {
        this(fullName,100,"Gun");
    }

    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;
        if (health < 0) {
            health = 1;
        } else if (health > 100) {
            health = 100;
        } else {
            healthPercentage = health;
        }
        healthPercentage = health;
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        healthPercentage = healthPercentage - damage;
        if (healthPercentage <= 0) {
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth) {
        healthPercentage = healthPercentage + extraHealth;
        if (healthPercentage > 100) {
            System.out.println("Health restored to 100%");
            healthPercentage = 100;
        }
    }
}
