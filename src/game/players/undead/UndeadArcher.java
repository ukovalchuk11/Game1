package game.players.undead;

import game.players.Hero;

import java.util.Random;

public class UndeadArcher implements Hero {
    private static final String nameOfArcher = "Undead hunter";
    private static final double archerDamage = 4;
    private static final double meleeDamage = 2;
    private static final double fullHealth =100;
    private static double health;


    @Override
    public boolean action(Hero hero, boolean enemy) {
        hero.damage(archerDamage);
        hero.damage(meleeDamage);
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

    public static String getNameOfArcher() {
        return nameOfArcher;
    }

    public static double getHealth() {
        return health;
    }

    public static void setHealth(int health) {
        UndeadArcher.health = health;
    }
}
