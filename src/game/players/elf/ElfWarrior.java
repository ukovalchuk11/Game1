package game.players.elf;


import game.players.Hero;

public class ElfWarrior implements Hero {
    private static final String nameOfWarrior = "Elf warrior ";
    private static final int swordDamage = 15;
    private static final int fullHealth =100;
    private static int health;

    @Override
    public boolean action(Hero hero, boolean enemy) {
        hero.damage(swordDamage);
        return enemy;
    }

    @Override
    public void damage(int ip) {
        health=fullHealth-ip;
    }

    @Override
    public boolean isLife() {
        if(health>0){
            return true;
        }
        return false;
    }

    public static String getNameOfWarrior() {
        return nameOfWarrior;
    }

    public static int getHealth() {
        return health;
    }

    public static void setHealth(int health) {
        ElfWarrior.health = health;
    }
}
