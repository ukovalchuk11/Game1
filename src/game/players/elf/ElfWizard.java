package game.players.elf;



import game.players.Hero;

public class ElfWizard implements Hero {
    private static final String nameOfWizard = "Elf wizard ";
    private static final int magicDamage=10;
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