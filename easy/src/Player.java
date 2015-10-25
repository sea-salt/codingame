import java.util.Scanner;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position
        int currentTX = initialTX;
        int currentTY = initialTY;
    
        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            String command = "";
            // Thor = 5, Light = 10 (Y)
            // direction = Light - Thor
            // direction = 5 (South)
            int directionY = lightY - currentTY;
            System.err.println("directionY: " + directionY); 
            if (directionY < 0) {
                command = "N";
                currentTY--;
            }
            else if (directionY > 0) {
                command = "S";
                currentTY++;
            }
            
            int directionX = lightX - currentTX;
            if (directionX < 0) {
                command += "W";
                currentTX--;
            }
            else if (directionX > 0) {
                command += "E";
                currentTX++;
            }
            

            System.out.println(command); // A single line providing the move to be made: N NE E SE S SW W or NW
        }
        
    }
    
}