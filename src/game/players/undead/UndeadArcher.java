package game.players.undead;

import game.players.Hero;

public class UndeadArcher implements Hero {
    private static final String nameOfArcher = "Undead hunter";
    private static final int archerDamage = 4;
    private static final int meleeDamage = 2;
    private static final int fullHealth =100;
    private static int health;

    @Override
    public boolean action(Hero hero, boolean enemy) {
        hero.damage(archerDamage);
        hero.damage(meleeDamage);
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
}
