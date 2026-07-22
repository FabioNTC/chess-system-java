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
		return "C";
	}
}
