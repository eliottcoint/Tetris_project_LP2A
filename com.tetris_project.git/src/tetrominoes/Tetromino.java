package tetrominoes;
import com.tetris_project.git.Vector2D;

public class Tetromino {
	
	public Vector2D position;
	public int orientation;
	public int[][][] arrayPiece; 
	
	public Tetromino(Vector2D position, int orientation, int[][][] arrayPiece) {
		super();
		this.position = position;
		this.orientation = orientation;
		this.arrayPiece = arrayPiece;
	}
	public Tetromino() {
		this.position = new Vector2D(); 
		this.orientation = 0; 
		this.arrayPiece = new int[5][5][5]; 
	}

	public void Rotate(int direction) {
		//Rotate (1 clockwise / -1 counter-clockwise) 
		int rotaTest = orientation + direction; 
		//Handle out of bounds rotations
		if ( rotaTest + direction < 0) {
			rotaTest = 3;
		}
		else if (rotaTest + direction > 3) {
			rotaTest = 0; 
		}
		//Rotate 
		this.orientation = rotaTest; 
	}
	public void Move(Vector2D direction) {
		position.add(direction);
	}
	
}
