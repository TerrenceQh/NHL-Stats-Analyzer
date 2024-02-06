import java.util.*;
import java.io.*;
public class NHLListDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("src/nhlstats.txt");
        Scanner fl = new Scanner(file);
        //initialize the NHL stats list and all variables
        NHLStats statbook = new NHLStats();
         String player;
         String pos;
         String team;
         int GP;
         int G;
         int A;
         int pen;
         int SOG;
         int GWG;
         PlayerRecord p = null;
         //read in file and create player records
        while (fl.hasNext()) {
            player = fl.next();
            pos = fl.next();
            team = fl.next();
            GP = fl.nextInt();
            G = fl.nextInt();
            A = fl.nextInt();
            pen = fl.nextInt();
            SOG = fl.nextInt();
            GWG = fl.nextInt();
             p = new PlayerRecord(player,pos,team,GP,G,A,pen,SOG,GWG);
             statbook.add(p);
        }
        fl.close();
        //using FileWriter class for output
        FileWriter nhlstatsoutput = new FileWriter("src/nhlstatsoutput.txt");
        nhlstatsoutput.write("Players with the most points: \n");
        nhlstatsoutput.write(statbook.maxPts() + "\n");
        nhlstatsoutput.write("Most aggressive players, their teams and their positions: \n");
        nhlstatsoutput.write(statbook.mostAgg() + "\n");
        nhlstatsoutput.write("Most valuable players and their teams: \n");
        nhlstatsoutput.write(statbook.mvp() + "\n");
        nhlstatsoutput.write("Most promising players and their teams: \n");
        nhlstatsoutput.write(statbook.mostProm() + "\n");
        nhlstatsoutput.write("Teams that had the most number of penalty minutes: \n");
        nhlstatsoutput.write(statbook.teamAgg() + "\n");
        nhlstatsoutput.write("Teams that had the most number of game winning goals: \n");
        nhlstatsoutput.write(statbook.teamGWG() + "\n");
        nhlstatsoutput.close();
    }
}
