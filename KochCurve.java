public class KochCurve{
  private int x;
  private int y;

  //Constructor


  //
   public void moveAndDraw(Graphics g, int distance, double angleDegrees) {
        // Convert angle to radians for calculations
        double angleRadians = Math.toRadians(angleDegrees);


        // Calculate the new position
        int newX = x + (int) (distance * Math.cos(angleRadians));
        int newY = y - (int) (distance * Math.sin(angleRadians)); // Subtract because y increases downward


        // Draw a line from the current position to the new position
        g.drawLine(x, y, newX, newY);


        // Update the current position
        x = newX;
        y = newY;
    }
}
