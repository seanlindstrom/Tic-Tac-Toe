package Input;
import org.lwjgl.glfw.GLFWCursorPosCallback;

/** Returns position (x, y) of mouse to be used in determining user input*/
public class mouse extends GLFWCursorPosCallback {
private double X; // x coordinate
private double Y; // y coordinate
	@Override
	
	/** Cursor constructor */
	Cursor(int width, int height, 
			int xHotspot, int yHotspot, 
			int numImages, java.nio.IntBuffer images, 
			java.nio.IntBuffer delays) {
		
		
	}
	
	/** Method gets current mouse position (x, y)
	 * Also sets class variables equal to current position
	 **/
	public void invoke(long window, double xPos, double yPos) {
		// TODO Auto-generated method stub
		X = xPos;
		Y = yPos;
	}
	
	/** Returns x coordinate of mouse on display */
	public double xPos() {
		return X;
	}
	
	/** Returns y coordinate of mouse on display */
	public double yPos() {
		return Y;
	}

}

