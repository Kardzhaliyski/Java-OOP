package rpg_lab;

import java.util.Random;

public class Dummy implements Target {

    private int health;
    private int experience;

    public Dummy(int health, int experience) {
        this.health = health;
        this.experience = experience;
    }

    public int getHealth() {
        return this.health;
    }

    public void takeAttack(int attackPoints) {
        if (this.isDead()) {
            throw new IllegalStateException("Dummy is dead.");
        }

        this.health -= attackPoints;
    }

    public int giveExperience() {
        if (!this.isDead()) {
            throw new IllegalStateException("Target is not dead.");
        }

        return this.experience;
    }

    public Weapon giveLoot(){
        Random random = new Random();
        return new Axe(random.nextInt(100), 100);
    }

    public boolean isDead() {
        return this.health <= 0;
    }
}
