package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {	// Protected as we want it to be accessed and used by the boardgame package only.
		return board;
	}
}
