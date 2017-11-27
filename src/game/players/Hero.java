package game.players;

public interface Hero {
    boolean action(Hero hero, boolean enemy);
    void damage (double ip);
    boolean isLife();

    default void privileged() {

    }

}
