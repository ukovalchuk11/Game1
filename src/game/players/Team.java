package game.players;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Team {
    ArrayList <Hero> heroElf = new ArrayList<>();
    ArrayList <Hero> heroHuman = new ArrayList<>();
    ArrayList <Hero> heroOrc = new ArrayList<>();
    ArrayList <Hero> heroUndead = new ArrayList<>();
    private final int numberWarrior = 4;
    private final int numberArcher = 3;
    private final int numberWizard = 1;

    private final List<Hero> heroes = new ArrayList<>();

    public boolean isLife() {
        return !heroes.isEmpty();
    }

    public void add(Hero ... hero) {
        this.heroes.addAll(Arrays.asList(hero));
    }

    public Hero member() {
        return this.heroes.get(
                new Random().nextInt(
                        this.heroes.size() - 1
                )
        );
    }

    public void kill(Hero enemy) {
        this.heroes.remove(enemy);
    }

}
