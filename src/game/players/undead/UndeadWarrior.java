package game.players.undead;

import game.players.Hero;

public class UndeadWarrior implements Hero {
    private static final String nameOfWarrior = "Undead zombie ";
    private static final int spearDamage = 18;
    private static final int fullHealth =100;
    private static int health;

    @Override
    public boolean action(Hero hero, boolean enemy) {
        hero.damage(spearDamage);
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
