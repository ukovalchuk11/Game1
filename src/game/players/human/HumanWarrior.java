package game.players.human;


import game.players.Hero;

public class HumanWarrior implements Hero {
    private static final String nameOfWarrior = "Human warrior ";
    private static final int swordDamage = 18;
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
}
