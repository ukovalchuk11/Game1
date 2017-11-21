package game.players;

public interface Hero {
    boolean action(Hero hero, boolean enemy);
    void damage (int ip);
    boolean isLife();

}
