import java.awt.Color;

public class Paddle extends Sprite {
	
	private final static Color PADDLE_COLOUR = Color.WHITE;
	 private final static int PADDLE_HEIGHT = 150;
	 private final static int PADDLE_WIDTH = 10;
	 private final static int EDGE_DISTANCE = 40;
	 
	 public Paddle(Player player, int panelWidth, int panelHeight) {
		 setWidth(PADDLE_WIDTH);
		 setHeight(PADDLE_HEIGHT);
		 setColour(PADDLE_COLOUR);
		 int xPos;
		 if(player == Player.One) {
			 xPos = EDGE_DISTANCE;
		 } else {
			 xPos = panelWidth - EDGE_DISTANCE - getWidth(); 
		 }
		 setInitialPosition(xPos, panelHeight /2 - (getHeight() / 2));
		 resetToInitialPosition();
	 }

}
