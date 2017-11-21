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

import java.util.ArrayList;

public class Team {
    ArrayList <Hero> heroElf = new ArrayList<>();
    ArrayList <Hero> heroHuman = new ArrayList<>();
    ArrayList <Hero> heroOrc = new ArrayList<>();
    ArrayList <Hero> heroUndead = new ArrayList<>();
    private final int numberWarrior = 4;
    private final int numberArcher = 3;
    private final int numberWizard = 1;

//    public void setArcher() {
//        for (int i=0;i<numberArcher;i++){
//            ElfsArcher elfsArcher= new ElfsArcher();
//            HumanArcher humanArcher = new HumanArcher();
//            OrcArcher orcArcher =new OrcArcher();
//            UndeadArcher undeadArcher=new UndeadArcher();
//            heroElf.add(elfsArcher);
//            heroHuman.add(humanArcher);
//            heroOrc.add(orcArcher);
//            heroUndead.add(undeadArcher);
//        }
//    }
//    public void setWarrior(){
//        for(int i=0;i<numberWarrior;i++){
//            ElfWarrior elfWarrior=new  ElfWarrior();
//            HumanWarrior humanWarrior=new HumanWarrior();
//            OrcWarrior orcWarrior=new OrcWarrior();
//            UndeadWarrior undeadWarrior = new UndeadWarrior();
//            heroElf.add(elfWarrior);
//            heroHuman.add(humanWarrior);
//            heroOrc.add(orcWarrior);
//            heroUndead.add(undeadWarrior);
//        }
//    }
//    public void setWizard(){
//        for(int i=0;i<numberWizard;i++){
//            ElfWizard elfWizard= new ElfWizard();
//            HumanWizard humanWizard=new HumanWizard();
//            OrcWizard orcWizard=new OrcWizard();
//            UndeadWizard undeadWizard= new UndeadWizard();
//            heroElf.add(elfWizard);
//            heroHuman.add(humanWizard);
//            heroOrc.add(orcWizard);
//            heroUndead.add(undeadWizard);
//        }
//
//    }

    public void setElfAndHuman(){

        for (int i=0;i<numberArcher;i++){
            ElfsArcher elfsArcher= new ElfsArcher();
            HumanArcher humanArcher = new HumanArcher();
            heroElf.add(elfsArcher);
            heroHuman.add(humanArcher);
        }
        for(int i=0;i<numberWarrior;i++){
            ElfWarrior elfWarrior=new  ElfWarrior();
            HumanWarrior humanWarrior=new HumanWarrior();
            heroElf.add(elfWarrior);
            heroHuman.add(humanWarrior);
        }
        for(int i=0; i<numberWizard;i++){
            ElfWizard elfWizard= new ElfWizard();
            HumanWizard humanWizard = new HumanWizard();
            heroElf.add(elfWizard);
            heroHuman.add(humanWizard);
        }

    }

    public  void setOrcAndUndead(){
        for (int i=0;i<numberArcher;i++){
            OrcArcher orcArcher = new OrcArcher();
            UndeadArcher undeadArcher = new UndeadArcher();
            heroOrc.add(orcArcher);
            heroUndead.add(undeadArcher);
        }
        for(int i=0;i<numberWarrior;i++){
            OrcWarrior orcWarrior= new OrcWarrior();
            UndeadWarrior undeadWarrior = new UndeadWarrior();
            heroOrc.add(orcWarrior);
            heroUndead.add(undeadWarrior);
        }
        for(int i=0; i<numberWizard;i++){
            OrcWizard orcWizard = new OrcWizard();
            UndeadWizard undeadWizard =new UndeadWizard();
            heroOrc.add(orcWizard);
            heroUndead.add(undeadWizard);
        }
    }

}
