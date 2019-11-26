package application;
import java.util.*;
import javafx.application.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.layout.Pane;
import javafx.stage.*;

public class Tetris extends Application{
	
	public static final int MOVE = 25;
	public static final int SIZE = 25;
	public static int XMAX = SIZE*12;
	public static int YMAX = SIZE*24;
	public static int[][] MESH = new int[XMAX/SIZE][YMAX/SIZE];
	private static Pane groupe = new Pane();
	private static Form object;
	private static Scene scene = new Scene(groupe, XMAX+150, YMAX);
	public static int score = 0;
	private static boolean game = true;
	private static Form nextObj = controller.makeRect();
	private static int linesNo = 0;
	
	public static void main(String[] args) {
		//that
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
