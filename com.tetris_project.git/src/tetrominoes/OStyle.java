package tetrominoes;

public class OStyle extends Tetromino {
	public OStyle() {
		this.orientation = 0; 
		InitializeGrid(); 
	}
	public void InitializeGrid() {
		//Fill the array with zeros
		this.arrayPiece = new int[4][2][2]; 
		//Place the blocks
		
		//Rotation 0 :
		this.arrayPiece[0][0][0] = 1; 
		this.arrayPiece[0][0][1] = 1; 
		this.arrayPiece[0][1][0] = 1; 
		this.arrayPiece[0][1][1] = 1; 
		
		//Rotation 1 :
		this.arrayPiece[0][0][0] = 1; 
		this.arrayPiece[0][0][1] = 1; 
		this.arrayPiece[0][1][0] = 1; 
		this.arrayPiece[0][1][1] = 1; 
		
		//Rotation 2 :
		this.arrayPiece[0][0][0] = 1; 
		this.arrayPiece[0][0][1] = 1; 
		this.arrayPiece[0][1][0] = 1; 
		this.arrayPiece[0][1][1] = 1; 
		
		//Rotation 3 :
		this.arrayPiece[0][0][0] = 1; 
		this.arrayPiece[0][0][1] = 1; 
		this.arrayPiece[0][1][0] = 1; 
		this.arrayPiece[0][1][1] = 1; 
	}
}
