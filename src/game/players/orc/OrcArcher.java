package game.players.orc;

import game.players.Hero;

import java.util.Random;

public class OrcArcher implements Hero {
    private static final String nameOfArcher = "Orc archer";
    private static final double archerDamage = 3;
    private static final double meleeDamage = 2;
    private static final double fullHealth = 100;
    private Random random = new Random();
    private boolean isOrc = random.nextBoolean();
    private static double health;
    private static double privileged;

    @Override
    public boolean action(Hero hero, boolean enemy) {
        if (isOrc) {
            hero.damage(archerDamage*privileged);
            return enemy = true;
        } else
            hero.damage(meleeDamage*privileged);
            return enemy = true;
    }

    @Override
    public void damage(double ip) {
        health = fullHealth - ip;
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

    public static String getNameOfArcher() {
        return nameOfArcher;
    }

    public static double getHealth() {
        return health;
    }

    public static void setHealth(int health) {
        OrcArcher.health = health;
    }
}
