package game.players.elf;



import game.players.Hero;

import java.util.Random;

public class ElfWizard implements Hero {
    private static final String nameOfWizard = "Elf wizard ";
    private static final double magicDamage=10;
    private static final double fullHealth =100;
    private Random random = new Random();
    private boolean isElf = random.nextBoolean();
    private static double health;
    private static double privileged;



    @Override
    public boolean action(Hero hero, boolean enemy) {
        if(isElf) {
            hero.damage(magicDamage * privileged);
            return enemy;
        }
        else
            hero.privileged();
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
        if(isElf){
            privileged=1.5;
        }
        else
            privileged=1;
    }

    public static String getNameOfWizard() {
        return nameOfWizard;
    }

    public static double getHealth() {
        return health;
    }

    public static void setHealth(int health) {
        ElfWizard.health = health;
    }
}