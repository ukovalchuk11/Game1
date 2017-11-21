package game.players.human;

import game.players.Hero;

public class HumanWizard implements Hero {
    private static final String nameOfWizard = "Human wizard ";
    private static final int magicDamage=4;
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
        if(health>0){
            return true;
        }
        return false;
    }

}
