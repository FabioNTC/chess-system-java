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
}
