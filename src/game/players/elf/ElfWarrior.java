package game.players.elf;


import game.players.Hero;

import java.util.Random;

public class ElfWarrior implements Hero {
    private static final String nameOfWarrior = "Elf warrior ";
    private static final double swordDamage = 15;
    private static final double fullHealth =100;
    private Random random = new Random();
    private boolean isElf = random.nextBoolean();
    private static double health;
    private static double privileged;

    @Override
    public boolean action(Hero hero, boolean enemy) {
        hero.damage(swordDamage*privileged);
        return enemy=true;
    }

    @Override
    public void damage(double ip) {
        health=fullHealth-ip;
    }

    @Override
    public boolean isLife() {
        return health > 0;
    }

    public static String getNameOfWarrior() {
        return nameOfWarrior;
    }

    @Override
    public void privileged() {
        if(isElf){
            privileged=1.5;
        }
        else
            privileged=1;
    }

    public static double getHealth() {
        return health;
    }

    public static void setHealth(int health) {
        ElfWarrior.health = health;
    }
}
