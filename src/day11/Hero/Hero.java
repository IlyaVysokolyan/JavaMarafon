package day11.Hero;

public abstract class Hero {

    private double health;

    private int maxHealth = 100;
    private int minHealth = 0;

    public Hero() {
        this.health = getMaxHealth();
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getMinHealth() {
        return minHealth;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public abstract void physicalAttack(Hero hero);

    @Override
    public String toString() {
        return "health=" + health +
                '}';
    }

}
