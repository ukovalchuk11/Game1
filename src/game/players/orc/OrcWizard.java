package game.players.orc;

import game.players.Hero;

import java.util.Random;

public class OrcWizard implements Hero {
    private static final String nameOfWizard = "Orc shaman ";
    private static final int fullHealth =100;
    private Random random = new Random();
    private boolean isOrc = random.nextBoolean();
    private static double health;
    private static double privileged;

    @Override
    public boolean action(Hero hero, boolean enemy) {
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

    public static String getNameOfWizard() {
        return nameOfWizard;
    }

    public static double getHealth() {
        return health;
    }

    public static void setHealth(int health) {
        OrcWizard.health = health;
    }
}
