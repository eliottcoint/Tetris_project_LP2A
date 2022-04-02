package tetrominoes;
import java.util.List;

public class TStyle extends Tetromino {
	
	public TStyle() {
		this.orientation = 0; 
		InitializeGrid(); 
	}
	public void InitializeGrid() {
		//Fill the array with zeros
		this.arrayPiece = new int[4][3][3]; 
		//Place the blocks
		
		//Rotation 0 :
		this.arrayPiece[0][0][1] = 1; 
		this.arrayPiece[0][1][0] = 1; 
		this.arrayPiece[0][1][1] = 1; 
		this.arrayPiece[0][1][2] = 1; 
		
		//Rotation 1 :
		this.arrayPiece[1][0][1] = 1; 
		this.arrayPiece[1][1][1] = 1; 
		this.arrayPiece[1][1][2] = 1; 
		this.arrayPiece[1][2][1] = 1; 
		
		//Rotation 2 :
		this.arrayPiece[2][1][0] = 1; 
		this.arrayPiece[2][1][1] = 1; 
		this.arrayPiece[2][1][2] = 1; 
		this.arrayPiece[2][2][1] = 1; 
		
		//Rotation 3 :
		this.arrayPiece[3][0][1] = 1; 
		this.arrayPiece[3][1][0] = 1; 
		this.arrayPiece[3][1][1] = 1; 
		this.arrayPiece[3][2][1] = 1; 
	}
}
