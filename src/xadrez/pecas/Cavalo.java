package xadrez.pecas;

import boardgame.Board;
import xadrez.ChessPiece;
import xadrez.Color;

public class Cavalo extends ChessPiece{

	public Cavalo(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "H";
	}

	@Override
	public boolean[][] possibleMoves() {
		// TODO Auto-generated method stub
		boolean[][] mat = new boolean [getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}
}
