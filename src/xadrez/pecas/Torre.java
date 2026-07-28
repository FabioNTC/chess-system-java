package xadrez.pecas;

import boardgame.Board;
import xadrez.ChessPiece;
import xadrez.Color;

public class Torre extends ChessPiece{

	public Torre(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "H";
	}

	@Override
	public boolean[][] possibleMoves() {
		// TODO Auto-generated method stub
		return null;
	}
}
