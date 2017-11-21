package game.players.orc;

import game.players.Hero;

public class OrcWarrior implements Hero {
    private static final String nameOfWarrior = "Orc goblin ";
    private static final int batonDamage = 20;
    private static final int fullHealth =100;
    private static int health;

    @Override
    public boolean action(Hero hero, boolean enemy) {
        hero.damage(batonDamage);
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
