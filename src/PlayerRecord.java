public class PlayerRecord {

    // Declare private fields to store player data
    private String player;  // Name of the player
    private String pos;     // Position of the player (e.g., RW, C, etc.)
    private String team;    // Team name
    private int GP;         // Games played
    private int G;          // Goals scored
    private int A;          // Assists
    private int pen;        // Penalty minutes
    private int SOG;        // Shots on goal
    private int GWG;        // Game-winning goals

    // Default constructor to initialize fields with default values
    public PlayerRecord(){
        player = "";
        pos = "";
        team = "";
        GP = 0;
        G = 0;
        A = 0;
        pen = 0;
        SOG = 0;
        GWG = 0;
    }

    // Parameterized constructor to set player data when an object is created
    public PlayerRecord(String player, String pos, String team, int GP, int G, int A, int pen, int SOG, int GWG){
        this.player = player;
        this.pos = pos;
        this.team = team;
        this.GP = GP;
        this.G = G;
        this.A = A;
        this.pen = pen;
        this.SOG = SOG;
        this.GWG = GWG;
    }

    // Calculate and return the total points (Goals + Assists)
    public int getPoints(){
        return G + A;
    }

    // Getter methods to access the private fields
    public String getPlayer() {
        return player;
    }

    public String getPos() {
        return pos;
    }

    public String getTeam() {
        return team;
    }

    public int getGP() {
        return GP;
    }

    public int getG() {
        return G;
    }

    public int getA() {
        return A;
    }

    public int getPen() {
        return pen;
    }

    public int getSOG() {
        return SOG;
    }

    public int getGWG() {
        return GWG;
    }

    // Setter methods to modify the private fields
    public void setPlayer(String player) {
        this.player = player;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setGP(int GP) {
        this.GP = GP;
    }

    public void setG(int G) {
        this.G = G;
    }

    public void setA(int A) {
        this.A = A;
    }

    public void setPen(int pen) {
        this.pen = pen;
    }

    public void setSOG(int SOG) {
        this.SOG = SOG;
    }

    public void setGWG(int GWG) {
        this.GWG = GWG;
    }
}
