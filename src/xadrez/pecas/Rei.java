package xadrez.pecas;

import boardgame.Board;
import xadrez.ChessPiece;
import xadrez.Color;

public class Rei extends ChessPiece{

	public Rei(Board board, Color color) {
		super(board, color);
	}
	@Override
	public String toString() {
		return "K";
	}
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean [getBoard().getRows()][getBoard().getColumns()];
		return mat;
	}
}
