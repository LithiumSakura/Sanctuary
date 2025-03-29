public class Sanctuary
{
    // ANSI color codes
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    
    // Background colors
    public static final String BLACK_BACKGROUND = "\u001B[40m";
    public static final String RED_BACKGROUND = "\u001B[41m";
    public static final String GREEN_BACKGROUND = "\u001B[42m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";
    public static final String BLUE_BACKGROUND = "\u001B[44m";
    public static final String PURPLE_BACKGROUND = "\u001B[45m";
    public static final String CYAN_BACKGROUND = "\u001B[46m";
    public static final String WHITE_BACKGROUND = "\u001B[47m";

    // Syntax
    public static final String ITALICS = "\033[3m";

    public static void main(String[] args) throws Exception
    {
        // Initialise the game
        String command = "";
        int room = 1;

        String[][] map = {
            {"X"," "," "," "," "," "},
            {" "," "," "," "," "," "},
            {" "," "," "," "," "," "},
            {" "," "," "," "," ","S"},
            {" "," "," "," "," "," "},
            {" "," "," "," "," "," "}
        };

        String[] backpack = {" "," ", };


        // Introduction
        System.out.println();
        System.out.println(YELLOW + "You wake up in a dystopian world, the radio is crackling as a transmission comes through." + RESET);
        System.out.println("'If anyone is out there.. there is a Sanctuary for you at grid location F4. Over.'");
        System.out.println(RED + ITALICS + "You open your map and mark where the Sanctuary is." + ITALICS + RESET);
        printMap(map);

        System.out.println(RED + ITALICS + "'I guess I should pack my bag..'" + ITALICS + RESET);







        System.out.println(PURPLE + "\nPress Enter to exit..." + RESET);
        try {
            System.in.read();
        } catch (Exception e) {}
    }

    public static void printMap(String[][] map)
    {
        System.out.println("\n-----------------------------------------------------------------------------------------------------------------");
        System.out.print("|\tMap\t|");
        for (int i = 0; i < map[0].length; i++) {
            char columnLabel = (char)('A' + i);
            System.out.print("\t" + columnLabel + "\t|");
        }

        for (int i = 0; i < map.length; i++) {
            System.out.println("\n|---------------|---------------|---------------|---------------|---------------|---------------|---------------|");

            System.out.print("|\t" + (i+1) + "\t|");
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == "S") {
                    System.out.print(GREEN + "\t" + map[i][j] + RESET + "\t|");
                }
                else if (map[i][j] == "X") {
                    System.out.print(CYAN + "\t" + map[i][j] + RESET + "\t|");
                }
                else {
                    System.out.print("\t" + map[i][j] + "\t|");
                }
            }
        }
        System.out.println("\n-----------------------------------------------------------------------------------------------------------------");
        System.out.println(RESET);
    }
}