import java.util.HashMap;

public class NHLStats {
    private List<PlayerRecord> players;
    public NHLStats(){
        players = new List<PlayerRecord>();
    }
    public void add(PlayerRecord p){
        players.add(p);
    }
    public PlayerRecord first() {
        return players.first();
    }

    // Method to find and return players with the most total points (Goals + Assists)
    public String maxPts(){

        // Create a list to store top players and initialize with the first player
        List<PlayerRecord> top = new List<>();
        PlayerRecord maxP = players.first();
        PlayerRecord p = players.first();

        // Iterate through the list to find top players
        while(p != null){
            if (p.getPoints() > maxP.getPoints()){
                maxP = p;
                top.clear();
                top.add(maxP);
            } else if (p.getPoints() == maxP.getPoints()){
                top.add(p);
            }
            p = players.next();
        }

        // Build a string containing the names and teams of top players
        PlayerRecord t = top.first();
        StringBuilder res = new StringBuilder();
        while (t != null){
            res.append(t.getPlayer() + " " + t.getTeam() + "\n");
            t = top.next();
        }
        return res.toString();
    }
    // Method to find and return players with the most penalty minutes
    public String mostAgg(){

        // Create a list to store top players and initialize with the first player
        List<PlayerRecord> top = new List<>();
        PlayerRecord maxP = players.first();
        PlayerRecord p = players.first();

        // Iterate through the list to find top players
        while(p !=null){
            if (p.getPen()> maxP.getPen()){
                maxP = p;
                top.clear();
                top.add(maxP);
            }else if (p.getPen() == maxP.getPen()){
                top.add(p);
            }
            p = players.next();
        }

        // Build a string containing the names and teams of top players
        PlayerRecord t = top.first();
        StringBuilder res = new StringBuilder();
        while (t!=null){
            res.append(t.getPlayer() + " " + t.getTeam() + " " + t.getPos() +"\n");
            t = top.next();
        }
        return res.toString();
    }
    // Method to find and return players with the most game winning goals
    public String mvp(){

        // Create a list to store top players and initialize with the first player
        List<PlayerRecord> top = new List<>();
        PlayerRecord maxP = players.first();
        PlayerRecord p = players.first();

        // Iterate through the list to find top players
        while(p !=null){
            if (p.getGWG()> maxP.getGWG()){
                maxP = p;
                top.clear();
                top.add(maxP);
            }else if (p.getGWG() == maxP.getGWG()){
                top.add(p);
            }
            p = players.next();
        }

        // Build a string containing the names and teams of top players
        PlayerRecord t = top.first();
        StringBuilder res = new StringBuilder();
        while (t!=null){
            res.append(t.getPlayer() + " " + t.getTeam() +"\n");
            t = top.next();
        }
        return res.toString();
    }
    // Method to find and return players with the most Shots on goal
    public String mostProm(){

        // Create a list to store top players and initialize with the first player
        List<PlayerRecord> top = new List<>();
        PlayerRecord maxP = players.first();
        PlayerRecord p = players.first();

        // Iterate through the list to find top players
        while(p !=null){
            if (p.getSOG()> maxP.getSOG()){
                maxP = p;
                top.clear();
                top.add(maxP);
            }else if (p.getSOG() == maxP.getSOG()){
                top.add(p);
            }
            p = players.next();
        }

        // Build a string containing the names and teams of top player
        PlayerRecord t = top.first();
        StringBuilder res = new StringBuilder();
        while (t!=null){
            res.append(t.getPlayer() + " " + t.getTeam() +"\n");
            t = top.next();
        }
        return res.toString();
    }
    public String teamAgg(){
        // Create a HashMap to store the total penalty minutes (teams) for each team
        HashMap<String, Integer> teams = new HashMap<String, Integer>();

        // Get the first player from the list
        PlayerRecord p = players.first();

        // Iterate through the list of players
        while (p != null) {
            // Check if the team is already in the HashMap
            if (teams.containsKey(p.getTeam())) {
                // If yes, update the total penalty minutes for the team
                teams.put(p.getTeam(), teams.get(p.getTeam()) + p.getPen());
            } else {
                // If not, add the team to the HashMap with its current penalty minutes
                teams.put(p.getTeam(), p.getPen());
            }
            p = players.next();
        }

        // Initialize a variable to keep track of the maximum total penalty minutes
        int maxNum = 0;

        // Iterate through the values (total penalty minutes) in the HashMap
        for (Integer values : teams.values()) {
            if (values > maxNum) {
                maxNum = values;
            }
        }

        // Create a StringBuilder to build the result string
        StringBuilder res = new StringBuilder();

        // Iterate through the keys (team names) in the HashMap
        for (String key : teams.keySet()) {
            // Check if the team has the maximum total penalty minutes
            if (teams.get(key) == maxNum) {
                res.append(key + "\n");
            }
        }
        return res.toString();
    }

    public String teamGWG() {
        // Create a HashMap to store the total game winning goals (teams) for each team
        HashMap<String, Integer> teams = new HashMap<String, Integer>();

        // Get the first player from the list
        PlayerRecord p = players.first();

        // Iterate through the list of players
        while (p != null) {
            // Check if the team is already in the HashMap
            if (teams.containsKey(p.getTeam())) {
                // If yes, update the total game winning goals for the team
                teams.put(p.getTeam(), teams.get(p.getTeam()) + p.getGWG());
            } else {
                // If not, add the team to the HashMap with its current game winning goals
                teams.put(p.getTeam(), p.getGWG());
            }
            p = players.next();
        }

        // Initialize a variable to keep track of the maximum total game winning goals
        int maxNum = 0;

        // Iterate through the values (total game winning goals) in the HashMap
        for (Integer values : teams.values()) {
            if (values > maxNum) {
                maxNum = values;
            }
        }

        // Create a StringBuilder to build the result string
        StringBuilder res = new StringBuilder();

        // Iterate through the keys (team names) in the HashMap
        for (String key : teams.keySet()) {
            // Check if the team has the maximum total game winning goals
            if (teams.get(key) == maxNum) {
                res.append(key + "\n");
            }
        }
        return res.toString();
    }
}
