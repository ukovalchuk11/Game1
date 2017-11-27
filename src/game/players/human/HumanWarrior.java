package game.players.human;


import game.players.Hero;

import java.util.Random;

public class HumanWarrior implements Hero {
    private static final String nameOfWarrior = "Human warrior ";
    private static final double swordDamage = 18;
    private static final double fullHealth =100;
    private Random random = new Random();
    private boolean isHuman = random.nextBoolean();
    private static double health;
    private static double privileged;

    @Override
    public boolean action(Hero hero, boolean enemy) {
        hero.damage(swordDamage*privileged);
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

    public static String getNameOfWarrior() {
        return nameOfWarrior;
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
        HumanWarrior.health = health;
    }
}
