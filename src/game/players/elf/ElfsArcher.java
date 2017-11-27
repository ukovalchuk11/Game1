package game.players.elf;


import game.players.Hero;

import java.util.Random;

public class ElfsArcher implements Hero {
    private static final String nameOfArcher = "Elf archer";
    private static final double archerDamage = 7;
    private static final double meleeDamage = 3;
    private static final double fullHealth = 100;
    private Random random = new Random();
    private boolean isElf = random.nextBoolean();
    private static double health;
    private static double privileged;

    //мы атакуем
    @Override
    public boolean action(Hero hero, boolean enemy) {
        if (isElf) {
            hero.damage(archerDamage * privileged);
            return enemy = true;
        } else
            hero.damage(meleeDamage);
        return enemy = true;
    }

    @Override // нас атаковали
    public void damage(double ip) {
        health = fullHealth - ip;
    }

    @Override//уровень жизни
    public boolean isLife() {
        return health > 0;
    }

    @Override
    public void privileged() {
        if (isElf) {
            privileged = 1.5;
        } else
            privileged = 1;
    }

    public static String getNameOfArcher() {
        return nameOfArcher;
    }

    public static double getHealth() {
        return health;
    }

    public static void setHealth(int health) {
        ElfsArcher.health = health;
    }
}
