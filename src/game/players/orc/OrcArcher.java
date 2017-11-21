package game.players.orc;

import game.players.Hero;

import java.util.Random;

public class OrcArcher implements Hero {
    private static final String nameOfArcher = "Orc archer";
    private static final int archerDamage = 3;
    private static final int meleeDamage = 2;
    private static final int fullHealth = 100;
    private Random random = new Random();
    private boolean isOrc = random.nextBoolean();
    private static int health;

    @Override
    public boolean action(Hero hero, boolean enemy) {
        if (isOrc) {
            hero.damage(archerDamage);
            return enemy = true;
        } else
            hero.damage(meleeDamage);
            return enemy = true;
    }

    @Override
    public void damage(int ip) {
        health = fullHealth - ip;
    }

    @Override
    public boolean isLife() {
        return health > 0;
    }

    public static String getNameOfArcher() {
        return nameOfArcher;
    }

    public static int getHealth() {
        return health;
    }

    public static void setHealth(int health) {
        OrcArcher.health = health;
    }
}
