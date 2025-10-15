import java.util.Random;

public class Enemy  {
    int health;
    int def;
    int attack;
    String name;

    public Enemy (int health, int def, int attack, String name) {
        this.health = health;
        this.def = def;
        this.attack = attack;
        this.name = name;
    }

    public void takeDamage(int damage) {
        int actualDamage = Math.max(0, damage - def);
        health -= actualDamage;
        System.out.println("Took " + actualDamage + " damage. Remaining health: " + health);
    }
    public boolean isAlive() {
        return health > 0;
    }
}
