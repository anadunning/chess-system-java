package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
	
	private Colour colour;

	public ChessPiece(Board board, Colour colour) {
		super(board);
		this.colour = colour;
	}

	public Colour getColour() {
		return colour;
	}
}