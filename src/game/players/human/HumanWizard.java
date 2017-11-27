package game.players.human;

import game.players.Hero;

import java.util.Random;

public class HumanWizard implements Hero {
    private static final String nameOfWizard = "Human wizard ";
    private static final double magicDamage=4;
    private static final double fullHealth =100;
    private Random random = new Random();
    private boolean isHuman = random.nextBoolean();
    private static double health;
    private static double privileged;

    @Override
    public boolean action(Hero hero, boolean enemy) {
        hero.damage(magicDamage);
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

    public static String getNameOfWizard() {
        return nameOfWizard;
    }

    @Override
    public void privileged() {
        if(isHuman){
            privileged=1.5;
        }
        else
            privileged=1;
    }

    public static double getHealth() {
        return health;
    }

    public static void setHealth(int health) {
        HumanWizard.health = health;
    }
}
