package game.players.orc;

import game.players.Hero;

import java.util.Random;

public class OrcWarrior implements Hero {
    private static final String nameOfWarrior = "Orc goblin ";
    private static final double batonDamage = 20;
    private static final double fullHealth =100;
    private Random random = new Random();
    private boolean isOrc = random.nextBoolean();
    private static double health;
    private static double privileged;

    @Override
    public boolean action(Hero hero, boolean enemy) {
        hero.damage(batonDamage*privileged);
        return enemy;
    }

    @Override
    public void damage(double ip) {
        health=fullHealth-ip;
    }

    @Override
    public boolean isLife() {
        return health > 0;
    }

    @Override
    public void privileged() {
        if(isOrc){
            privileged=1.5;
        }
        else
            privileged=1;
    }

    public static String getNameOfWarrior() {
        return nameOfWarrior;
    }

    public static double getHealth() {
        return health;
    }

    public static void setHealth(int health) {
        OrcWarrior.health = health;
    }
}
