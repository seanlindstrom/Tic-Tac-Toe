package Input;
import org.lwjgl.glfw.GLFWCursorPosCallback;


public class mouse extends GLFWCursorPosCallback {
private int X;
private int Y;
	@Override
	public void invoke(long arg0, double arg1, double arg2) {
		// TODO Auto-generated method stub
		
	}
	
	/** Returns x coordinate of mouse on display */
	public int xPos() {
		//code code code (updates x)... x = ...
		return X;
	}
	
	/** Returns y coordinate of mouse on display */
	public int yPos() {
		//code code code (updates y)... y = ...
		return Y;
	}

}

