package game.players.undead;


import game.players.Hero;

public class UndeadWizard implements Hero {
    private static final String nameOfWizard = "Undead necromancer ";
    private static final int magicDamage=5;
    private static final int fullHealth =100;
    private static int health;

    @Override
    public boolean action(Hero hero, boolean enemy) {
         hero.damage(magicDamage);
         return enemy;
    }

    @Override
    public void damage(int ip) {
        health=fullHealth-ip;
    }

    @Override
    public boolean isLife() {
        return health > 0;
    }

    public static String getNameOfWizard() {
        return nameOfWizard;
    }

    public static int getHealth() {
        return health;
    }

    public static void setHealth(int health) {
        UndeadWizard.health = health;
    }
}
