package game.players.human;


import game.players.Hero;

import java.util.Random;

public class HumanArcher  implements Hero {
    private static final String nameOfArcher = "Human archer";
    private static final double crossbowmanDamage = 5;
    private static final double meleeDamage = 3;
    private static final double fullHealth =100;
    private Random random = new Random();
    private boolean isHuman = random.nextBoolean();
    private static double health;
    private static double privileged;

    @Override
    public boolean action(Hero hero, boolean enemy) {
        hero.damage(crossbowmanDamage*privileged);
        hero.damage(meleeDamage*privileged);
        return enemy;
    }

    @Override
    public void damage(double ip) {
        health=fullHealth-ip;
    }

    @Override
    public boolean isLife() {
        return health>0;
    }

    @Override
    public void privileged() {
        if(isHuman){
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
        HumanArcher.health = health;
    }
}
