package game.players.human;


import game.players.Hero;

public class HumanArcher  implements Hero {
    private static final String nameOfArcher = "Human archer";
    private static final int crossbowmanDamage = 5;
    private static final int meleeDamage = 3;
    private static final int fullHealth =100;
    private static int health;

    @Override
    public boolean action(Hero hero, boolean enemy) {
        hero.damage(crossbowmanDamage);
        hero.damage(meleeDamage);
        return enemy;
    }

    @Override
    public void damage(int ip) {
        health=fullHealth-ip;
    }

    @Override
    public boolean isLife() {
        return health>0;
    }

    public static String getNameOfArcher() {
        return nameOfArcher;
    }

    public static int getHealth() {
        return health;
    }

    public static void setHealth(int health) {
        HumanArcher.health = health;
    }
}
