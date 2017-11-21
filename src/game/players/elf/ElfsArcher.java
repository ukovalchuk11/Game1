package game.players.elf;


import game.players.Hero;

import java.util.Random;

public class ElfsArcher implements Hero {
    private static final String nameOfArcher = "Elf archer";
    private static final int archerDamage = 7;
    private static final int meleeDamage = 3;
    private static final int fullHealth = 100;
    private Random random = new Random();
    private boolean isElf = random.nextBoolean();
    private static int health;

    //мы атакуем
    @Override
    public boolean action(Hero hero, boolean enemy) {
        if (isElf) {
            hero.damage(archerDamage);
            return enemy=true;
        } else
            hero.damage(meleeDamage);
            return enemy=true;
    }

    @Override // нас атаковали
    public void damage(int ip) {
        health = fullHealth - ip;
    }

    @Override//уровень жизни
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
        ElfsArcher.health = health;
    }
}
