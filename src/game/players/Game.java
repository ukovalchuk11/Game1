package game.players;

import game.players.elf.ElfWarrior;
import game.players.elf.ElfWizard;
import game.players.elf.ElfsArcher;
import game.players.human.HumanArcher;
import game.players.human.HumanWarrior;
import game.players.human.HumanWizard;
import game.players.orc.OrcArcher;
import game.players.orc.OrcWarrior;
import game.players.orc.OrcWizard;
import game.players.undead.UndeadArcher;
import game.players.undead.UndeadWarrior;
import game.players.undead.UndeadWizard;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


public class Game {
    //public static final String file = "game.txt";
    public static int number = 0;
    Team firstTeam = new Team();
    Team secondTeam = new Team();
    Random random = new Random();
    boolean lightTurn;

    //    public void battle() {
//        firstTeam.setElfAndHuman();
//        secondTeam.setOrcAndUndead();
//        while (isGameNotEnd()) {
//            Random random = new Random();
//            lightTurn = random.nextBoolean();
//            if (lightTurn) {
//                System.out.println();
//                number++;
//                teamElfAndHuman(firstTeam.heroElf, secondTeam.heroOrc, number);
//            } else {
//                System.out.println();
//                number++;
//                teamOrcAndUndead(secondTeam.heroOrc, firstTeam.heroElf, number);
//            }
//        }
//    }
//
//    boolean isGameNotEnd() {
//        if (firstTeam.heroElf.size() == 0) {
//            System.out.println();
//            System.out.println("------------------------------------");
//            System.out.println("The victory of the orc");
//            System.out.println("Number of expended moves = " + number + ". Thanks for the game");
//            return false;
//        } else if (secondTeam.heroOrc.size() == 0) {
//            System.out.println();
//            System.out.println("------------------------------------");
//            System.out.println("The victory of the elf");
//            System.out.println("Number of expended moves = " + number + ". Thanks for the game");
//            return false;
//        } else {
//            return true;
//        }
//    }
    public void battle() {
        Team firstTeam = this.createElfAndHuman();

        Team secondTeam = this.createOrcAndUndead();

        while (firstTeam.isLife() && secondTeam.isLife()) {
            lightTurn=random.nextBoolean();
            if (lightTurn) {
                this.move(firstTeam, secondTeam);
            } else
                this.move(secondTeam, firstTeam);
        }
    }

    private void move(Team heroes, Team enemies) {
        Hero hero = heroes.member();
        Hero enemy = enemies.member();
        if (hero.action(enemy, true)) {
            hero.action(heroes.member(), false);
        }
        if (!enemy.isLife()) {
            enemies.kill(enemy);
        }

    }

    public Team createElfAndHuman() {
        Team elfAndHuman = new Team();
        elfAndHuman.add(
                new ElfsArcher(),
                new ElfsArcher(),
                new ElfsArcher(),
                new ElfWarrior(),
                new ElfWarrior(),
                new ElfWarrior(),
                new ElfWarrior(),
                new ElfWizard(),
                new HumanArcher(),
                new HumanArcher(),
                new HumanArcher(),
                new HumanWarrior(),
                new HumanWarrior(),
                new HumanWarrior(),
                new HumanWarrior(),
                new HumanWizard()
        );
        return elfAndHuman;
    }

    public Team createOrcAndUndead() {
        Team orcAndUndead = new Team();
        orcAndUndead.add(
                new OrcArcher(),
                new OrcArcher(),
                new OrcArcher(),
                new OrcWarrior(),
                new OrcWarrior(),
                new OrcWarrior(),
                new OrcWarrior(),
                new OrcWizard(),
                new UndeadArcher(),
                new UndeadArcher(),
                new UndeadArcher(),
                new UndeadWarrior(),
                new UndeadWarrior(),
                new UndeadWarrior(),
                new UndeadWarrior(),
                new UndeadWizard()
        );
        return orcAndUndead;
    }

    private static void printIntoGame(ArrayList<String> list) {
        File file = new File("game.txt");
        try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
            if (!file.exists()) {
                file.createNewFile();
            }
            out.flush();
            while (!list.isEmpty()) {
                //out.write(list.);
                out.newLine();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
