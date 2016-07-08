import static org.lwjgl.glfw.GLFW.*;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11.*;


public class Main{
	
	private static long window;
	
	public static boolean won = false;
	
	public static void main(String[] args) {
		
		init();
		
		run();
	}
	
	public static void run() {
		
		glfwShowWindow(window);
		
		while(!won) {
			
			while(glfwWindowShouldClose(window) != true) {
				GLFW.glfwPollEvents();
			}
			
			updateBoard();
			
			render();
			
			if(gameIsWon()) {
				won = true;
			}
		}
	}
	
	private static boolean gameIsWon() {
		// TODO Auto-generated method stub
		return false;
	}
	
	/*
	 * initializes the game
	 */
	public static void init() {
		glfwInit();
		
		window = GLFW.glfwCreateWindow(900, 900, "Tic Tac Toe", 0, 0);
		
		Board board = new Board();
		
	}
	
	public static void updateBoard(){
		
	}
	
	public static void render() {
		
	}

}
//Testing commit