//this is the parent class of the paddles and the ball
//Both paddles and ball have some attributes in common: Position and Velocity and Colour

import java.awt.Color;
import java.awt.Rectangle;

public class Sprite {
	//declaring the variables we will use for the paddles and ball.
	private int xPosition, yPosition;
	private int xVelocity, yVelocity;
	private int width, height;
	private Color colour;
	private int initialXPosition, initialYPosition;

	// Getter methods (these allow us to get the information of the otherwise private attributes of the Sprite)
	public int getxPosition() {
		return xPosition;
		}
	public int getyPosition() {
		return yPosition;
		}
	public int getxVelocity() {
		return xVelocity;
		}
	public int getyVelocity() {
		return yVelocity;
		}
	public int getWidth() {
		return width;
		}
	public int getHeight() {
		return height;
		}
	public Color getColour() {
		return colour;
		}
	public Rectangle getRectangle() {
		return new Rectangle(getxPosition(), getyPosition(), getWidth(), getHeight());
	}

	// Setter methods (these allow us to change the otherwise private attributes of the Sprite)
	public void setInitialPosition(int initialX, int initialY) {
		initialXPosition = initialX;
		initialYPosition = initialY;
	}
	public void resetToInitialPosition() {
		setxPosition(initialXPosition);
		setyPosition(initialYPosition);
	}
	public void setxPosition(int xPosition) {
		this.xPosition = xPosition;
		}
	public void setyPosition(int yPosition) {
		this.yPosition = yPosition;
		}
	//the next two setter methods correct any sprite that goes out of bounds
	public void setXPosition(int newX, int panelWidth) {
		xPosition = newX;
		if(xPosition < 0) {
			xPosition = 0; //cannot go past the left edge
			} else if(xPosition + width > panelWidth) {
				xPosition = panelWidth - width; //cannot go past the rigth edge
				}
		}
	public void setYPosition(int newY, int panelHeight) {
		yPosition = newY;
		if(yPosition < 0) {
			yPosition = 0;//cannot go above the top edge
			} else if(yPosition + height > panelHeight) {
				yPosition = panelHeight - height; //cannot go past the bottom edge
				}
		}
	public void setxVelocity(int xVelocity) {
		this.xVelocity = xVelocity;
		}
	public void setyVelocity(int yVelocity) {
		this.yVelocity = yVelocity;
		}
	public void setWidth(int width) {
		this.width = width;
		}
	public void setHeight(int height) {
		this.height = height;
		}
	public void setColour(Color colour) {
		this.colour = colour;
		}
	
}
