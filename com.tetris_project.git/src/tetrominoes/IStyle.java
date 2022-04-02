package tetrominoes;

public class IStyle extends Tetromino {
	public IStyle() {
		this.orientation = 0; 
		InitializeGrid(); 
	}
	public void InitializeGrid() {
		//Fill the array with zeros
		this.arrayPiece = new int[4][4][4]; 
		//Place the blocks
		
		//Rotation 0 :
		this.arrayPiece[0][1][0] = 1; 
		this.arrayPiece[0][1][1] = 1; 
		this.arrayPiece[0][1][2] = 1; 
		this.arrayPiece[0][1][3] = 1; 
		
		//Rotation 1 :
		this.arrayPiece[1][0][2] = 1; 
		this.arrayPiece[1][1][2] = 1; 
		this.arrayPiece[1][2][2] = 1; 
		this.arrayPiece[1][3][2] = 1; 
		
		//Rotation 2 :
		this.arrayPiece[2][2][0] = 1; 
		this.arrayPiece[2][2][1] = 1; 
		this.arrayPiece[2][2][2] = 1; 
		this.arrayPiece[2][2][3] = 1; 
		
		//Rotation 3 :
		this.arrayPiece[3][0][1] = 1; 
		this.arrayPiece[3][1][1] = 1; 
		this.arrayPiece[3][2][1] = 1; 
		this.arrayPiece[3][3][1] = 1; 
	}
}
