package game.players;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Game {
    //public static final String file = "game.txt";
    public static int number =0;
    Team firstTeam= new Team();
    Team secondTeam= new Team();
    boolean lightTurn;

    public void battle (){
        firstTeam.setElfAndHuman();
        secondTeam.setOrcAndUndead();
        while (isGameNotEnd()){
            Random random = new Random();
            lightTurn = random.nextBoolean();
            if (lightTurn) {
                System.out.println();
                number++;
                teamElfAndHuman(firstTeam.heroElf, secondTeam.heroOrc, number);
            } else {
                System.out.println();
                number++;
                teamOrcAndUndead(secondTeam.heroOrc, firstTeam.heroElf, number);
            }
        }
    }

    boolean isGameNotEnd() {
        if (firstTeam.heroElf.size() == 0) {
            System.out.println();
            System.out.println("------------------------------------");
            System.out.println("The victory of the orc");
            System.out.println("Number of expended moves = " + number + ". Thanks for the game");
            return false;
        } else if (secondTeam.heroOrc.size() == 0) {
            System.out.println();
            System.out.println("------------------------------------");
            System.out.println("The victory of the elf");
            System.out.println("Number of expended moves = " + number + ". Thanks for the game");
            return false;
        } else {
            return true;
        }
    }

    public void teamElfAndHuman(List<Hero> elfAndHuman, List<Hero> orcAndUndead, int number){

    }

    public void teamOrcAndUndead(List<Hero> orcAndUndead, List<Hero> elfAndHuman, int number){

    }

    private static void printIntoGame(ArrayList<String> list)
    {
        File file = new File("game.txt");
        try(BufferedWriter out = new BufferedWriter(new FileWriter(file)))
        {
            if (!file.exists()) {
                file.createNewFile();
            }
            out.flush();
            while(!list.isEmpty())
            {
                //out.write(list.pop);
                out.newLine();
            }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
