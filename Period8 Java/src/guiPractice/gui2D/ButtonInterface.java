package guiPractice.gui2D;

import java.awt.Color;

import guiPractice.components.Clickable;

public interface ButtonInterface extends Clickable {

	void setX(int row,int col);
	void setY(int row,int col);
	void setColor(Color black);

}
